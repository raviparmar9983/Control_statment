import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the third number");
        int c=sc.nextInt();
        if(a+b+c==180){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
