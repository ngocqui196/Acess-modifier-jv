package Roam;

public class Bc {
    protected void msga(){
        System.out.println("Hello world");
    }
}
class D extends Bc {
    public static void main(String[] args) {
        Bc obj = new Bc();
        obj.msga();
    }
}
