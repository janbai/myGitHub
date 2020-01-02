package Q019;

public class Test {
void readCard() throws Exception {
System.out.println("Reading Card");
}
void checkCard(int carNo) throws Exception {
System.out.println("Checking Card");
}
public static void main(String[] args) throws Exception { // line n1
Test ex = new Test();
int carNo = 12344;
ex.checkCard(carNo); // line n2
ex.readCard(); // line n3
}
}