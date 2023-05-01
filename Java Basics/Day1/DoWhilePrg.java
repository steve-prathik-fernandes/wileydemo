import java.util.Scanner;

public class DoWhilePrg{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter numbers from 1 to 10");
            num=scan.nextInt();
        }while(num<1 || num>10);

    }
}