import java.util.*;
class Poly
{
	public static int minsec() {
	return 60;
	}
	public static double feetcm() {
	return 30.48; 
	}
	public static long cb() {
	return 1000000;
	}
	public static int cf() {
	return 32;
	}
	public static long kg() {
	return 1000;
	}
	public static long mbkb() {
	return 1024;
	}
}
class Convention extends Poly
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args)throws Exception 
	{
		boolean b = true;
		while (b)
		{
		System.out.println("\t\t\t\"Welcome to Calculator\"");
		System.out.println("Choose the Conventions");
		System.out.println("1.Minutes to Seconds \n2.Foot to Centimeter \n3.Cubic meter to Cubic centimeter \n4.Celsius to Fahrenheit  \n5.Kilogram to Grams  \n6.MegaBytes to Kilobytes \n7.Exit");
		int user_input = s.nextInt();
		switch (user_input)
		{
		case 1:{ System.out.println("Minutes to Seconds");
				 System.out.println("Enter the Number");
				 int user1 = s.nextInt();
				 int a = Poly.minsec();
				 int sum;
				 sum = a*user1;
				 System.out.println("Enter value : "+user1+"\nThe Convention of is :"+sum);
			break;
			}
		case 2: { System.out.println("Foot to Centimeter");
				  System.out.println("Enter the Number");
				  int user2 = s.nextInt();
				  double a = Poly.feetcm();
				  double sum;
				  sum = a*user2;
				  System.out.println("Enter value : "+user2+"\nThe Convention of is :"+sum);
			break; 
				}
		case 3: {System.out.println("Cubic meter to Cubic centimeter");
				System.out.println("Enter the Number");
				int user3 = s.nextInt();
				long a = Poly.cb();
				long sum;
				sum = a*user3;
				System.out.println("Enter value : "+user3+"\nThe Convention of is :"+sum);
			break;
				}
		case 4: {System.out.println("Celsius to Fahrenheit");
				System.out.println("Enter the Number");
				int user4 = s.nextInt();
				int a = Poly.cf();
				int sum;
				sum = a*user4;
				System.out.println("Enter value : "+user4+"\nThe Convention of is :"+sum);
			break;
				}
		case 5: {System.out.println("Kilogram to Grams");
				System.out.println("Enter the Number");
				int user5 = s.nextInt();
				long a = Poly.kg();
				long sum;
				sum = a*user5;
				System.out.println("Enter value : "+user5+"\nThe Convention of is :"+sum);
			break;}
		case 6: {System.out.println("MegaBytes to Kilobytes");
				System.out.println("Enter the Number");
				int user6 = s.nextInt();
				long a = Poly.mbkb();
				long sum;
				sum = a*user6;
				System.out.println("Enter value : "+user6+"\nThe Convention of is :"+sum);
			break;}
			default  :{ 
					System.out.println("*************");
					b = false;
					}
		}
		}
	}
}