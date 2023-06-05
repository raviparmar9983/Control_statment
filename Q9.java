import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number");
        int a=sc.nextInt();
        // System.out.println("enter the second number");
        int b=sc.nextInt();
        // System.out.println("enter the third number");
        int c=sc.nextInt();
        if(a==b && b==c){
            System.out.println("equilateral");
        }
        else if(a!=b && b!=c){
            System.out.println("scalene");
        }
        else{
            System.out.println("isosceles");
        }
       
    }
}

