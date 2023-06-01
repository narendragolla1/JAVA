/* Write a program to find all root of a quadratic equation. The standard form a quadratic equation is ax^2+bx+c=0 */
/* input:
 *   a=8
 *   b=-4
 *   c=-2
 *  output:
 *   root 1: 0.80
 *   root 2:-0.30
 * */

package switchcase;
import java.util.Scanner;
import java.lang.Math;


public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // using the formula sqrt(B^2-4*a*c)/2*a we can find root
       double root1, root2;
        double d = Math.sqrt(b * b - 4 * a * c);
        root1 = (-b+d)/ (2* a);
        root2 =  (-b-d) / (2* a);
        System.out.println(root1);
        System.out.println(root2);
    }
}
