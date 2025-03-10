package Facade;

public class Light {
    private String pos;
    public Light(String pos){
        this.pos=pos;
    }
    public void on(){
        System.out.println(this.pos+"ƴ");
    }
    public void off(){
        System.out.println(this.pos+"ƹر");
    }
}
