package Casting_4_27_44_51_55_66_96_107_142;

public class Q051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSum(10, 20); // int sum is 30 //// int, long, doable, float, Integer
		doSum(10.0, 20.0); // double sum is 30.0
		
	}


		public static void doSum(Integer X, Integer Y) {
		System.out.println("Integer sum is " + (X + Y));
		}
		
		public static void doSum(double x, double Y) {
		System.out.println("double sum is " + (x + Y));
		}
		/*
		public static void doSum(long X, long Y) {
			System.out.println("long sum is " + (X + Y));
			}
		*/
		public static void doSum(float x, float Y) {
		System.out.println("float sum is " + (x + Y));
		}
		
		public static void doSum(Float X, Float Y) {
			System.out.println("Float sum is " + (X + Y));
			}
		/*
		 public static void doSum(int x, int Y) {
		System.out.println("int sum is " + (x + Y));
		}
		*/
		public static void doSum(Short x, Short Y) {
			System.out.println("short sum is " + (x + Y));
			}
		
}
