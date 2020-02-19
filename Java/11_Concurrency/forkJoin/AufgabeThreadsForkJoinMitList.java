package forkJoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;



public class AufgabeThreadsForkJoinMitList {
	
	static class ToUpperCaseAction extends RecursiveAction {
		private static final int MAX_LIST_SIZE = 1000; 
		
		private List<String> list;

		public ToUpperCaseAction(List<String> list) {
			this.list = list;
		}
		
		@Override
		protected void compute() {
			if( list.size() <= MAX_LIST_SIZE ) {
				for (int i = 0; i < list.size(); i++) {
					String text = list.get(i).toUpperCase(); 
					list.set(i, text);
				}
			} else {
				
				int mitte = list.size() / 2;
				List<String> listA = list.subList(0, mitte);
				List<String> listB = list.subList(mitte, list.size());
				
				invokeAll(new ToUpperCaseAction(listA), new ToUpperCaseAction(listB));
			}
		}
	}
	
	
	static class GetMaxTask extends RecursiveTask<String> {
		private final int MAX_LIST_SIZE = 2000;
		
		private List<String> list;

		public GetMaxTask(List<String> list) {
			this.list = list;
		}

		@Override
		protected String compute() {
			if(list.size()<=MAX_LIST_SIZE) {
				String max = "";
				
				for (String s : list) {
					max = getMax(max, s);
				}
				
				return max;
			} else {
			
				int mitte = list.size() / 2;
				
				GetMaxTask t1 = new GetMaxTask(list.subList(0, mitte));
				GetMaxTask t2 = new GetMaxTask(list.subList(mitte, 0));
				
				t1.fork();
				String s2 = t2.compute();
				String s1 = t1.join();
				
				return getMax(s1, s2);
			}
		}
	}
	
	public static void main(String[] args) {
	a2();
	//	a3();
	}

	public static void a3() {
		System.out.println("*** A3");

		List<String> list = ResourceLoader.loadPasswords();
		
		ForkJoinPool pool = new ForkJoinPool();
		String max = pool.invoke(new GetMaxTask(list));
		
		System.out.println("max: " + max);
	}
	
	public static void a2() {
		System.out.println("*** A2");

		List<String> list = ResourceLoader.loadEnglishWords();
		
		RecursiveAction taskToUpperCase = new ToUpperCaseAction(list);
		
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(taskToUpperCase);

		list.forEach(System.out::println);
		
	}

}
