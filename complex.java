package test;

import java.util.Scanner;

public class complex {
	 double real;  // 实部  
	 double image; // 虚部  
		 complex(){  // 不带参数的构造方法
				Scanner input = new Scanner(System.in);
				double real = input.nextDouble();
				double image = input.nextDouble();
				complex(real,image);
			}
		 
			private void complex(double real, double image) { // 供不带参数的构造方法调用
				// TODO Auto-generated method stub
				this.real = real;
				this.image = image;
			}
		 
			complex(double real,double image){ // 带参数的构造方法
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
			
			complex add(complex a){ // 复数相加
				double real2 = a.getReal();
				double image2 = a.getImage();
				double newReal = real + real2;
				double newImage = image + image2;
				complex result = new complex(newReal,newImage);
				return result;
			}
			
			complex sub(complex a){ // 复数相减
				double real2 = a.getReal();
				double image2 = a.getImage();
				double newReal = real - real2;
				double newImage = image - image2;
				complex result = new complex(newReal,newImage);
				return result;
			}
			
			complex mul(complex a){ // 复数相乘
				double real2 = a.getReal();
				double image2 = a.getImage();
				double newReal = real*real2 - image*image2;
				double newImage = image*real2 + real*image2;
				complex result = new complex(newReal,newImage);
				return result;
			}
			
			complex div(complex a){ // 复数相除
				double real2 = a.getReal();
				double image2 = a.getImage();
				double newReal = (real*real2 + image*image2)/(real2*real2 + image2*image2);
				double newImage = (image*real2 - real*image2)/(real2*real2 + image2*image2);
				complex result = new complex(newReal,newImage);
				return result;
			}
			
			public void print(){ // 输出
				if(image > 0){
					System.out.println(real + " + " + image + "i");
				}else if(image < 0){
					System.out.println(real + "" + image + "i");
				}else{
					System.out.println(real);
				}
			}
	 }