package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		/**
		 * 9.4
		 */
		System.out.println("Nhập phương trình bậc 2 , a =");
		float a = sc.nextFloat();
		System.out.println("Nhập phương trình bậc 1 , b =");
		float b = sc.nextFloat();
		System.out.println("Nhập phương trình tự do , c = ");
		float c = sc.nextFloat();
	
		if (a == 0) {
			if (b == 0) { 
				System.out.println("Phương trình vô nghiệm ");
			} else {
				System.out.println("Phương trình có vô số nghiệm: " + "x =" + (-c / b));
			}
		}else {
			float delta = b*b - 4*a*c;
			float x1;
			float x2;
	   
			if (delta > 0) {
				x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
				x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
				System.out.println("Phương trình có 2 nghiệm là: "
						+ "x1 = " + x1 + " và x2 = " + x2);
			} else if (delta == 0) {
				x1 = (-b / (2 * a));
				System.out.println("Phương trình có nghiệm kép: "
	                + "x1 = x2 = " + x1);
			} else {
				System.out.println("Phương trình vô nghiệm!");
			}		
			/**
			 * 9.1			 
			 */
			System.out.println("Nhap vào so nguyen e");
			int e = sc.nextInt();
			if(e > 0){
				System.out.println("e la so nguyen duong ");
			}else{
				System.out.println("e la so nguyen am ");
			}
			/**
			 * 9.2
			 */
			System.out.println("Nhap vao so nguyen n");
			int n = sc.nextInt();
			if(n % 3 == 0 ) {
				System.out.println("n chia het cho 3 ");
			}else {
				System.out.println("n khong chia het cho 3");
			}			
			if(n % 5 == 0) {
				System.out.println("n chia het cho 5");
			}else {
				System.out.println("n khong chia het cho 5");
			}
			/**
			 * 9.3
			 */
			System.out.println("Mời bạn nhập tháng ");
			int month = sc.nextInt();
			
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				System.out.println("Thang co 31 ngay");
				else if(month == 4 || month == 6 || month == 9 || month == 11)
				System.out.println("Thang co 30 ngay");
				else if(month == 2)
				System.out.println("Thang co 28 ngay");		
			 
			
			}	
			/**
			 * 9.5
			 */
		System.out.println("Nhap canh a :");
		double v = sc.nextDouble();	
		System.out.println("Nhap canh b :");
		double t = sc.nextDouble();
		System.out.println("Nhap canh c :");
		double y = sc.nextDouble();

		if ((v + t > y) || (v + y > t) || (t + y > v)) {
			System.out.println("Đây là tam giác !");
		}
		if ((v == t) || (t == y) || (y == v)) {
			System.out.println("Đây là tam giác cân !");
		} else if ((v == t) && (t == y) && (y == v)) {
			System.out.println("Đây là tam giác đều !");
		} else if ((v * v == t * t + y * y) || (t * t == v * v + y * y) || (y * y == t * t + v * v)) {
			System.out.println("Đây là tam giác vuông !");
		} else {
			System.out.println("Đây không phải tam giác");
		}
			
		// TODO Auto-generated method stub

	}

	}
