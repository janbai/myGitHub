package passByValue_1_25_131;
//Q131
public class Test131 {
int x, y;
public Test131(int x, int y) {
//initialize(x, y); 	//	0 0
	initialize(x, y); 	// 	9 25
}
public void initialize(int x, int y) {
this.x = x * x; // without "this" the result 0 0 
this.y = y * y;
}
public static void main(String[] args) {
int x = 3, y = 5;
Test131 obj = new Test131(x, y);
System.out.println(x + " " + y);
System.out.println(obj.x + " " + obj.y);
obj.initialize(obj.x, obj.y);
System.out.println(obj.x + " " + obj.y); // 81 625
}
}