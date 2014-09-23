package comparestrings1;

import java.util.Scanner;

public class CompareStrings1 {

    public static void main(String[] args) {
        
        String str1;
        String str2;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What's your first string?: ");
        str1 = keyboard.nextLine();
        
        System.out.println("What's your second string?: ");
        str2 = keyboard.nextLine();
        
        if(str1.equalsIgnoreCase(str2))
        {
        System.out.println(str1 + " equals to " + str2);
        }
        else
        {
        System.out.println(str1 + " doesn't equal to " + str2);
        }
    }
    
}
