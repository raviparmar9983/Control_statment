import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        int amount=sc.nextInt();
        System.out.println("enter the chpise ADD(1) or DEBIT(2)");
        int type=sc.nextInt();
        if(type==1){
            
            System.out.println("enter the amount");
            int add=sc.nextInt();
            amount+=add;

        }
        else if (type==2){
            
            System.out.println("enter the amount");
            int debit=sc.nextInt();
            if(debit>amount){
                System.out.println("Invalid Input");
            }
            else{
                amount-=debit;
            }
        }
        else{
            System.out.println("Invalid input");
        }
        System.out.println(amount);
    }
}
