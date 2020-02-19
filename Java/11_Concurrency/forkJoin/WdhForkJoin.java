package forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class WdhForkJoin {
static class MyTaskA extends RecursiveAction{

	@Override
	protected void compute() {
		MyTaskB t1 = new MyTaskB(1);
		MyTaskB t2 = new MyTaskB(2);
		
		t1.fork();
		
		t1.join();
		t2.compute();
		
	}
	
}

static class MyTaskB extends RecursiveAction{
	int x;
	
	public MyTaskB(int x) {
		this.x = x;
	}

	@Override
	protected void compute() {
		System.out.print(x +" ");
		
	}
	
}
	public static void main(String[] args) {
		new ForkJoinPool().invoke(new MyTaskA());
		

	}

}
