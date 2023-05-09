package Lambda;

interface Sayable{
    void say();
}

interface GetInfo{
    Info getMsg(String str);
}
class Info {
    Info(String msg){
        System.out.println(msg);
    }
}

public class MethodReference {
    public void hello(){
        System.out.println("You just came across hello method");
    }

    public static void saySomething(){
        System.out.println("Hello this is a static method");
    }
    public static void processSomething(){
        System.out.println("PROCESSING.....");
    }


    public static void main(String[] args) {
        MethodReference mt=new MethodReference();
        Sayable isv=mt::hello;//Object::method
        Sayable sayable=MethodReference::saySomething; //class::static method
        //Calling interface method
        sayable.say();
        isv.say();
        //Thread
        GetInfo info=Info::new;
        info.getMsg("InfoMsg");

        Thread t1=new Thread(MethodReference::processSomething);
        t1.start();
    }
}

