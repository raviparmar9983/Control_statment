import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the third number");
        int c=sc.nextInt();
        int min=a;
        if (min>b) {
            if(b>c){
                min=c;
            }
            else{
                min=b;
            }
        }
        else if(min>c){
            if(c<b){
                min=c;
            }
            else{
                min=b;
            }
        }
        else{
            min=a;
        }
        System.out.println(min);
    }
}

