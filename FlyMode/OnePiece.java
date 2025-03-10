package FlyMode;

public class OnePiece extends Apiece{
    public OnePiece(String inKind) {
        super(inKind);
    }

    @Override
    public void play(int x, int y) {
        System.out.println(""+inKind+"ӷ("+x+","+y+")λ");
    }
}
