package FlyMode;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        PieceFactory pieceFactory = new PieceFactory();
        for (int i = 0; i < 19; i++) {
            for (int j=0;j<19;j++){
                Apiece p;
                if(random.nextInt()%2==0)
                    p=pieceFactory.getPiece("");
                else
                    p=pieceFactory.getPiece("");
                p.play(random.nextInt(19),random.nextInt(19));
            }
            System.out.println("Ӷ"+pieceFactory.getPieceCount());
        }
    }
}
