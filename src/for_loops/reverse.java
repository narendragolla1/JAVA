package for_loops;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int rev=0;
        // Here idk the number of iterations
        // that is why we used here while loop
        // when n=0 we will stop iteration
       while(n>0)
       {
           rev=rev*10+(n%10);
           n/=10;
       }
       System.out.println(rev);
    }
}
