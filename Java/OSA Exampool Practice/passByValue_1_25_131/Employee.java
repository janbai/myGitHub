package passByValue_1_25_131;
//Q025

// Which two modifications, when made independently, enable the code to print joe:true: 100.0?
public class Employee {
String name;
boolean contract;
double salary;



Employee() {
// line n1
	//this("Joe", true, 100); // Compilation fails should add constructor public Employee(String name, boolean contract, double salary) {
	this.name = new String("Joe");
	this.contract = new Boolean(true);
	this.salary = new Double(100);
}
public String toString() {
return name + ":" + contract + ":" + salary;
}
public static void main(String[] args) {
Employee e = new Employee();
// line n2
//e.name = "Joe";
//e.contract = true;
//e.salary = 100;

System.out.print(e);
}
}
