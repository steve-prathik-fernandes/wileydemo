package BillPackage;

import java.util.*;
import AdminPackage.Product;
import java.util.List;

public class Bill {
long billingId;
String customerName;
double totalAmt=0.0;
List<Product>l=new ArrayList<>();
public Bill(List<Product> l){
  this.l=l;
//  System.out.println("Bill Class Called");
  generateBill();
  displayBill();
  new Payments(totalAmt);
}
public Bill() {
	
}
   
public void generateBill(){
    
    billingId=00000000000001;
    billingId++;
//Adding grand total
for(Product p:l){
    totalAmt+=p.getPrice();
    }
}
public  void displayBill(){
    
   
    System.out.println("---------------------------------------------------");
    System.out.println("Billing Id :"+billingId);
    System.out.println();
    System.out.println("----------- Products Purchased----------------------");
    for(Product p:l){
      System.out.println(p.getName()+" "+p.getDecription()+" "+p.getPrice());
    }
    System.out.println("------------------------------------------------------------");
    System.out.println("Grand Total = "+totalAmt);
    
}

}