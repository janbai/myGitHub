package ocp_self_test;

enum Animals {
 DOG("woof"), CAT("meow"), FISH("burble");
 String sound;
 Animals(String s) {
	 sound = s; 
	 }
 }

 public class TestEnum {
 static Animals a;
 public static void main(String[] args) {
 System.out.println(Animals.DOG.sound + " " + a.FISH.sound);

	}

}
