package DataStructures;

import java.util.Scanner;

public class grade {


    public static void main(String[] args) {
        float maths,physics,chemistry;
        float avg=0.0f;char grade=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter marks");
        maths=scan.nextFloat();
        physics=scan.nextFloat();
        chemistry=scan.nextFloat();

        if((maths<=35 && physics <=35) && chemistry<=35){
            System.out.println("You have failed");

        }
        else {
            avg = (maths + physics + chemistry) / 3;
        }

        if(avg<=59)
            grade='C';
            else if(avg<=69)
                grade='B';

            else
                 grade ='A';

        System.out.println("Your Grade :"+grade);






    }
}
