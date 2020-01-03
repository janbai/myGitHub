package Exceptions_8_45_72_73_81_93;
//Q019
public class Test {
void readCard() throws RuntimeException {
System.out.println("Reading Card");
}
void checkCard(int carNo) throws RuntimeException {
System.out.println("Checking Card");
}
public static void main(String[] args) throws RuntimeException { // line n1
Test ex = new Test();
int carNo = 12344;
ex.checkCard(carNo); // line n2
ex.readCard(); // line n3
}
}