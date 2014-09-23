package fibonacci.numbers;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {
        
        int num;
        System.out.println("Enter the number of Fibonacci numbers: ");
        Scanner keyboard = new Scanner (System.in);
        num = keyboard.nextInt();
        
        int num1 = 0;
        int num2 = 1;
        int temp;
        
        for(int count = 1; count <= num; count++){
            temp = num1;
            num1=num2;
            num2=temp+num1;
            System.out.println(temp);
        }
    }
}
