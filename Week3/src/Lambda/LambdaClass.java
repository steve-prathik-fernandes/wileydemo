package Lambda;


public class LambdaClass {
static String printThing(Printable thing){
    String p="Steve",s="Prathik";
    return thing.print(p,s);
}

    public static void main(String[] args) {
        Product myProd=new Product();
        //myProd.print();

        Printable lambdaPrinciple=  ((p,s) ->{ return ("Wiley Edge "+p+s);});
        System.out.println(printThing(lambdaPrinciple));
    }
}

