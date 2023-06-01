/*
* for loop:
* ---------
*   when we know exact no of interations
* for(intialexpression;testexpression;updateexpresssion){
*  body of loop
* }
*
*   sometimes we could go to infinite loop
*   Eg: for(int i=1;i<=3;i--){}
*       In this case the loop is decrementing
*       DRY: 1--=0  and 0<=3
*            0--=-1 and -1<=3
*       it will never evaluate the false in the above case so it is called infinite loop
*
*   While loop: when number of iterations are not known.(eg: in case of linked list iteration we use while loop)
*   -----------
*              while(test_expression){
*
*                   update_expression;
*               }
*
*      do-while:
*           bit different from for and while loop
*           similar to while loop
*           execution once before the test condition is checked.
*           irrespective of test condition it will execute do loop.
*
*
*
* */



package for_loops;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        // for loop iteration from 1 to number
        for(int i=1;i<=number;i++)
        {
            System.out.println(i);
        }

        // do while
        int i=10;
            do{
                // excute this statement
                System.out.println("hello "+"all");
                i--;
            }
            while(i>0);
        {
            System.out.println(i);

        }



    }
}
