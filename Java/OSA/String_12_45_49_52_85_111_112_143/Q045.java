package String_12_45_49_52_85_111_112_143;

public class Q045 {

	public static void main(String[] args) {


		// Q045
		
				String str1 = "Java";
				String str2 = new String("java");
				// line n1
				stringCompare_1(str1,str2); // Not Equal
				stringCompare_2(str1,str2); // Equal
				stringCompare_3(str1,str2); // Not Equal
				stringCompare_4(str1,str2); // Not Equal
			}
		static void stringCompare_1(String str1, String str2) {
			String str3 = str2;
			if (str1 == str3) {
				System.out.println("Equal");
			} else {
				System.out.println("Not Equal");
				}
		}	

		static void stringCompare_2(String str1, String str2) {

			if (str1.equalsIgnoreCase(str2)) {
				System.out.println("Equal");
			} else {
				System.out.println("Not Equal");
				}
		}	
			
		static void stringCompare_3(String str1, String str2) {
			
			String str3 = str2;
					if (str1.equals(str3)) {
				System.out.println("Equal");
			} else {
				System.out.println("Not Equal");
				}
		}	

		static void stringCompare_4(String str1, String str2) {
			System.out.print(str1.toLowerCase() + " | ");
			System.out.print(str2.toLowerCase() + " : ");
			if (str1.toLowerCase() == str2.toLowerCase()) {
				System.out.println("Equal");
			} else {
				System.out.println("Not Equal");
				}
		}	
		}
