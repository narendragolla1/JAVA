/*
* Write a program to check weather a triangle is equilateral scalene, or isosceles.
* input:
*   30
*   30
*   30
* output: Triangle is equilateral triangle
*
*
* */


package switchcase;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();
        if( a == b&& b==c) {
            System.out.println("Triangle is equilateral triangle");
            }
        else{
            if (a==b || b==c ||c==a)
                System.out.println("Triangle is isosceles triangle");
            else System.out.println("Triangle is scalene triangle");
        }



        

    }
}
