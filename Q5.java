import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        if(a%2!=0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}
