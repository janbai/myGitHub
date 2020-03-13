package selfTest11;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SingletonTestDrive {
public static void main(String args[]) {
CyclicBarrier barrier = new CyclicBarrier(3, () -> {
System.out.println(Singleton.INSTANCE.getValue());
});
Runnable r = () -> {
for (int i = 0; i < 100; i++) {
Singleton.INSTANCE.updateValue();
}
try {
barrier.await();
} catch (InterruptedException | BrokenBarrierException e) {
e.printStackTrace();
}
};
Thread t1 = new Thread(r);
Thread t2 = new Thread(r);
Thread t3 = new Thread(r);
t1.start(); t2.start(); t3.start();
System.out.println("Main thread is complete");
}
}

enum Singleton {
INSTANCE;
int value = 0;
private void doSomethingWithValue() {
value = value + 1;
}

public synchronized int updateValue() {
doSomethingWithValue();
return value;
}
public int getValue() {
return value;
}
}