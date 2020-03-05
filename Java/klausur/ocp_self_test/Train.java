package ocp_self_test;

public class Train {
class RanOutOfTrack extends Exception { }
class AnotherTrainComing extends Exception { }
public static void main(String[] args) throws RanOutOfTrack,
AnotherTrainComing {
Train a = new Train();
try {
a.drive();
System.out.println("toot! toot!");
} catch(Exception e) {
System.out.println("error locomoting");
throw e;
}
}
void drive() throws RanOutOfTrack, AnotherTrainComing {
throw new RanOutOfTrack();
} }