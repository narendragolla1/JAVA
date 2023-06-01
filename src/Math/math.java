package Math;
import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int flag = 1;
        if(number==0 ||number==1)
        {
            System.out.println(" Not a Prime number");
        }
        for (int i = 2; i < number; i++) {
            if (number % i != 0) {
               continue;
            }
            else {
                flag = 0;
                System.out.println("Not a prime number");
                break;
            }
        }
        if (flag==1)
            System.out.println("Prime number");
    }
}
