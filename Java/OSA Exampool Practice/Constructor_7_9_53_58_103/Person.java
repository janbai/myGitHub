package Constructor_7_9_53_58_103;
//Q058_Q103
public class Person {
String name;
int age = 25;
public Person() {
	this.name= "Houssam";
}

public Person(String name) {
this(); // line n1
setName(name);
}
public Person(String name, int age) {
	//Person(name); // CompilerFehler
this(name); // line n2
setAge(age);
}

public String show() {
return name + " " + age;
}

//setter and getter methods go here
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public static void main(String[] args) {
Person p1 = new Person("Jesse");
Person p2 = new Person("Walter", 52);
System.out.println(p1.show());
System.out.println(p2.show());
}
}