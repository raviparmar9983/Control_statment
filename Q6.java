import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        if(a>b){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}
