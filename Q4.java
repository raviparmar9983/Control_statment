import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the third number");
        int c=sc.nextInt();
        int max=a;
        if (max<b) {
            if(b<c){
                max=c;
            }
            else{
                max=b;
            }
        }
        else if(max<c){
            if(c>b){
                max=c;
            }
            else{
                max=b;
            }
        }
        else{
            max=a;
        }
        System.out.println(max);
    }
}
