package trainingpool;

public class TestClass {
	int x = 0;
    int getX(){ return x; }
	
    
    
    
    public static void main(String[] args) {


    	
    	
    	    /*  int ia[][] = { {1, 2}, null };
    	      for (int i = 0; i < 2; i++)
    	         for (int j = 0; j < 2; j++) 
    	            System.out.println(ia[i][j]); //NullPointerException
    	   */
    	 
    	      int ib[][] = { {1, 0}, null }; 
    	      System.out.println(ib[3].length);
    	    //  System.out.println(ib[1][1]);//NullPointerException
	}//end of main

	
	
	 public void looper(){
         int x = 0;
         while( (x = getX()) != 0 ){
             for(int m = 10; m>=0; m--){
                 x = m;
             }
         }
         
    }     
}
