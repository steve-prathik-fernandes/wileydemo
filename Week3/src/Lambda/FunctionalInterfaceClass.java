package Lambda;

interface Calc{
    //Abstract Method
    int calculate(int val);
}
public class FunctionalInterfaceClass {
    public static void main(String[] args) {
        //Lets implement abstract method of the calc interface
        Calc c1=(val)-> val+54;

        //Call the method
        System.out.println("Result :"+c1.calculate(54));
    }
}
