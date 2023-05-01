import java.util.Scanner;
class TotalCartValue{

    public double cartValue(int NoOfItems){
        Scanner scan=new Scanner(System.in);
        double TotalCart=0.0,eachprice=0.0;
        System.out.println("Enter the price of each product");
        for(int i=0;i<NoOfItems;i++){
            eachprice=scan.nextDouble();
            TotalCart+=eachprice;
        }
        return TotalCart;
    }

    public static void main(String args[]){
        TotalCartValue t=new TotalCartValue();
        double cart=t.cartValue(5);
        if(cart>10000){
            System.out.println("Total Cart Value ="+cart);
            System.out.println("Discount Applied = -"+(0.1*cart));
            System.out.println("Final Price       ="+(cart-(0.1*cart)));
        }
        else
        {
            System.out.println("Total Cart Value ="+cart);
            System.out.println("Final Price       ="+cart);
        }
        
    }
}