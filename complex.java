package test;

import java.util.Scanner;

public class complex {
	 double real;  // ʵ��  
	 double image; // �鲿  
		 complex(){  // ���������Ĺ��췽��
				Scanner input = new Scanner(System.in);
				double real = input.nextDouble();
				double image = input.nextDouble();
				complex(real,image);
			}
		 
			private void complex(double real, double image) { // �����������Ĺ��췽������
				// TODO Auto-generated method stub
				this.real = real;
				this.image = image;
			}
		 
			complex(double real,double image){ // �������Ĺ��췽��
				this.real = real;
				this.image = image;
			}
		 
			public double getReal() {
				return real;
			}
		 
			public void setReal(double real) {
				this.real = real;
			}
		 
			public double getImage() {
				return image;
			}
		 
			public void setImage(double image) {
				this.image = image;
			}
			
			complex add(complex a){ // �������
				double real2 = a.getReal();
				double image2 = a.getImage();
				double newReal = real + real2;
				double newImage = image + image2;
				complex result = new complex(newReal,newImage);
				return result;
			}
			
			complex sub(complex a){ // �������
				double real2 = a.getReal();
				double image2 = a.getImage();
				double newReal = real - real2;
				double newImage = image - image2;
				complex result = new complex(newReal,newImage);
				return result;
			}
			
			complex mul(complex a){ // �������
				double real2 = a.getReal();
				double image2 = a.getImage();
				double newReal = real*real2 - image*image2;
				double newImage = image*real2 + real*image2;
				complex result = new complex(newReal,newImage);
				return result;
			}
			
			complex div(complex a){ // �������
				double real2 = a.getReal();
				double image2 = a.getImage();
				double newReal = (real*real2 + image*image2)/(real2*real2 + image2*image2);
				double newImage = (image*real2 - real*image2)/(real2*real2 + image2*image2);
				complex result = new complex(newReal,newImage);
				return result;
			}
			
			public void print(){ // ���
				if(image > 0){
					System.out.println(real + " + " + image + "i");
				}else if(image < 0){
					System.out.println(real + "" + image + "i");
				}else{
					System.out.println(real);
				}
			}
	 }