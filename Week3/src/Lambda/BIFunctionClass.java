package Lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BIFunctionClass {
    public static void main(String[] args) {
        BinaryOperator<Integer> n=(a,b)-> a&b;
        System.out.println(n.apply(10,5));

//        UnaryOperator<Integer> n1=(a)-> a&a;
//        System.out.println(n1.apply(10));

    }
}
