package Proxy;

public class ClocalPicShow implements IshowPic,Runnable{
    private IshowPic pic;
    private String picname;
    @Override
    public void run(){
        try {
            pic.showPic(picname);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(picname+"ͼƬ");
    }

    @Override
    public void showPic(String picname) throws InterruptedException {
        pic=new CRemoPic();
        this.picname=picname;
        System.out.println("ͼƬ"+picname);
        Thread th=new Thread(this);
        th.start();

    }
}
