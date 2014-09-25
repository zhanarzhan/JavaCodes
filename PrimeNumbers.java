package primenumbers;

import java.util.Scanner;
public class PrimeNumbers {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int input = keyboard.nextInt();
        
        boolean prime = true;
        
        for(int i=2; i<input; i++){
            if(input%i==0){
                prime = false;
            }
        }
        if(prime==false){
            System.out.println(input+" is not a prime");
        }
        else{
                prime = true;
                System.out.println(input+" is a prime");
                }
    }
    
}
