package Decorator;

public class Cake implements IBirthdayCake {
    public Cake(){
        System.out.println("");
    }
    @Override
    public void show() {
        System.out.println("չʾ");
    }
}
