package self_test;

public class Person {
String name;
int age = 25;
public Person(String name) {

setName(name);
}
public Person(String name, int age) {
this.name= name; // line n2
setAge(age);
}
// setter and getter methods go here
public String show() {
return name + " " + age;
}
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