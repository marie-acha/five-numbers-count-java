/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author acha.marie
 */

import java.util.Scanner; 

public class FiveNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int countMinus = 0; //variable to hold the number of negative number, if no negative, it will return 0
        int countPlus = 0; //variable to hold the number of positive number, if no positive, it will return 0
        int countZero = 0; //variable to hold the number of zero number, if no zero, it will return 0
        int countNum = 1; //counter variable to use in while loop
        int number; //variable to hold the input numbers, it will increment until it reached five
        
        System.out.println("User to input five numbers...");
        
        //it will prompt the user to input a number FIVE times
        while(countNum <= 5) {
            System.out.print("Enter number: ");
            number = input.nextInt();
            
            //if else statement to determine where count variable the number will be store. 
            if (number == 0)
                countZero++;
            else if(number > 0)
                countPlus++;
            else
                countMinus++;
            countNum++; //increment 
        }
        
        System.out.println("Number of positive input: " + countPlus);
        System.out.println("Number of zero input: " + countZero);
        System.out.println("Number of negative input: " + countMinus); 
    }
}
