package state;

public class BlokedState extends ThreadState {
	public BlokedState()
	{
		state=StateSet.BLOCKED;
		System.out.println("�����߳�");
	}
	public void resume(ThreadContext tc)
	{
		System.out.println("����resume����");
		if (state==StateSet.BLOCKED)
			tc.setThreadState(new RunnableState());
		else
			System.out.println("��ǰ�̲߳����½�״̬");
	}
}
