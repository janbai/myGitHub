package functional;
import java.util.ArrayList;
import java.util.function.Predicate;



public class AufgabeFiltern_lambda {
      public static void main(String[] args) {

	  	ArrayList<Integer> list = new ArrayList<>();

           list.add(12);
           list.add(13);
           list.add(14);
           list.add(15);
           list.add(-4);
           list.add(77);

           System.out.println("list: " + list);

      
           ArrayList<Integer> listGerade = filtern(list, (Integer z) -> {return z> 0 && z%2==0;});

           System.out.println("list gerade: " + listGerade); // 12, 14, -4
           

		              } // end of main

      
static ArrayList<Integer> filtern(ArrayList<Integer> list, Predicate<Integer> filter) {
   ArrayList<Integer> back = new ArrayList<>();
       
   for (Integer value : list) {
	     if(filter.test(value)){
	          back.add(value);
	       }
       }
       return back;
      }


}
