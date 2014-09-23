package bubblesort;

public class BubbleSort {

    public static void sort(String[] args) {
        
        int number[] = {5, 4, 3, 2,  1, 0};
        // index        0, 1, 2, 3, 4, 5
        int temp;
        boolean fixed=false;
                
        while(fixed==false){
        
        fixed=true;
        // if array is not completely sorted, boolean takes false value
        // and while loop will be executed again
        
        // if our array is already sorted, for loop will not
        // be executed, and boolean remains true, so the while loop stops
        for(int i=0; i<number.length-1; ++i){
            if(number[i]>number[i+1]){
                temp = number[i+1];
                // stores number 4
                number[i+1]=number[i];
                // replace 4 with 5
                // {5, 5, 3, 2, 1, 0}
                number[i]=temp; 
                // places instead of 5 with index 0, 4
                // {4, 5, 3, 2 , 1, 0}
                fixed=false;
            }   
        }
    }
  }
    public static void main (String[] args){
        int number[] = {5, 4, 3, 2,  1, 0};
        for (int i=0; i<number.length; ++i)
           System.out.print(number[i] + " ");
		System.out.println(); 
    }
} 
