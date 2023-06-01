package for_loops;
import java.util.Scanner;

public class sumofnatural {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //print sum of all natural numbers
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);

        // using while loop
        sum=0;
        int i=0;
            while(i<=n)
            {
                sum=sum+i;
                i++;
            }
        System.out.println("Using while loop "+sum);

    }
}
