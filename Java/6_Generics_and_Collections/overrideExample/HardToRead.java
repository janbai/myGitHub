package overrideExample;
class Bob {
	int shoeSize;
	String nickName;
	
	Bob(String nickName, int shoeSize) {
		this.shoeSize = shoeSize;
		this.nickName = nickName;
	}
	
	public String toString() {
		return ("I am a Bob, but you can call me " + nickName +
		". My shoe size is " + shoeSize);
	}
}
public class HardToRead {

	public static void main (String [] args) {
		HardToRead h1 = new HardToRead();
		System.out.println(h1);						//overrideExample.HardToRead@1e81f4dc
		System.out.println("h1.hashCode(): " + h1.hashCode());			//511833308
		System.out.println(h1.getClass().getName());	//overrideExample.HardToRead
		
		HardToRead h2 = new HardToRead();
		h2=h1;
		System.out.println("h2.hashCode(): " + h2.hashCode());
		System.out.println(h1.hashCode()==h2.hashCode());
		/*the class name followed by the @ symbol, 
		 * followed by the unsigned hexadecimal representation of the object's hashcode.
		 */
		
		String hex = "1e81f4dc";
		int decimal=Integer.parseInt(hex,16);  
		System.out.println(decimal);  				//511833308
		
		//override the toString() method :
		
		Bob f = new Bob("GoBobGo", 19);
		System.out.println(f);
	}
}