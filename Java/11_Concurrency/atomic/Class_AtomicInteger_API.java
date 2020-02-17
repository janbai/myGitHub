package atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Class_AtomicInteger_API {
static final 	String fmt = "%-40s%s%n";
	public static void main(String[] args) {


		AtomicInteger x = new AtomicInteger();
		System.out.printf(fmt,"x=", x);
		AtomicInteger y = new AtomicInteger(12);
		System.out.printf(fmt,"y=", y);

		System.out.printf(fmt,"get():", y.get());
		x.set(20);
		System.out.printf(fmt,"void set(20)=> x=", x);
		System.out.printf(fmt,"getAndSet(25)", x.getAndSet(25) + " => x= " + x);
		
		
		System.out.printf(fmt,"compareAndSet(25,26)= " , x.compareAndSet(25,  26) +  " => x= " + x);
		System.out.printf(fmt,"compareAndExchange(26,27)= " , x.compareAndExchange(26, 27) +  " => x= " + x);
		System.out.printf(fmt,"compareAndExchangeRelease(27,28)= " , x.compareAndExchangeRelease(27, 28) +  " => x= " + x);
		System.out.printf(fmt,"weakCompareAndSetPlain(28,29)= " , x.weakCompareAndSetPlain(28, 29) +  " => x= " + x);
		System.out.printf(fmt,"compareAndExchangeAcquire(28,29)= " , x.compareAndExchangeAcquire(28, 29) +  " => x= " + x);
		System.out.printf(fmt,"getAndIncrement()= " , x.getAndIncrement() +  " => x= " + x);
		System.out.printf(fmt,"incrementAndGet()= " , x.incrementAndGet() +  " => x= " + x);
		System.out.printf(fmt,"getAndDecrement()= " , x.getAndDecrement() +  " => x= " + x);
		System.out.printf(fmt,"decrementAndGet()= " , x.decrementAndGet() +  " => x= " + x);
		System.out.printf(fmt,"getAndAdd(2)= " , x.getAndAdd(2) +  " => x= " + x);
		System.out.printf(fmt,"addAndGet(3)= " , x.addAndGet(3) +  " => x= " + x);
		System.out.printf(fmt,"getAndUpdate(a -> a*2)= " , x.getAndUpdate(a -> a*2 ) +  " => x= " + x);
		System.out.printf(fmt,"updateAndGet(a -> a*2)= " , x.updateAndGet(a -> a*2 ) +  " => x= " + x);
		
		System.out.printf(fmt,"getAndAccumulate(2, (a,b)-> (a+b))= " , x.getAndAccumulate(2, (a,b)-> (a+b)) +  " => x= " + x);
		
		
	}

}
