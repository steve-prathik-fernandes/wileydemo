package optimization;

//Lazy initialization is a technique that displays that creation of an object until it is actually needed;

public class DefineClass {
    // Inefficient way of creating object immediately
    // private Object DefiineClass = new Object();

    private Object myObject;

    public Object getMyObject() {
        if (myObject == null) {
            myObject = new Object();
        }
        return myObject;
    }

    public static void main(String[] args) {

    }
}