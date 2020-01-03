package Q083;
public class Vowel {

	private char var;

public static void main(String[] args) {
char var1 = 'a';
char var2 = var1;
var2 = 'e';

 Vowel obj1 = new Vowel();
 
 obj1.var = 'i';
 Vowel obj2 = obj1;
 obj2.var = 'o';

 System.out.println(var1 + ", " + var2);
 System.out.println(obj1.var + ", " + obj2.var);
 
 Vowel obj3 = new Vowel();
 obj3.var = 'x';
 obj1 = obj3;
 System.out.println(obj1.var + ", " + obj3.var);
 
 obj1.var = 'y';
 obj3 = obj1;
 System.out.println(obj1.var + ", " + obj3.var);
 }
}