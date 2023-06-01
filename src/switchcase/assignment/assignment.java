   /*Write a program to input the week number (1-7) and print the corresponding day of the week's name
   input: 1
   output: Monday
    
   
   */

package switchcase;
import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {

     
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number from 1 to 7");
        int number=input.nextInt();
        switch(number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
