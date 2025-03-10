package DProxy;

public class Client {
    public static void main(String[] args) {
//        IshowPic isp= (IshowPic) new CRemoPic();
//        ClocalPicShow cpic=new ClocalPicShow(isp);
//        IshowPic localpic= (IshowPic) cpic.getProxyInstance();
//
//        try {
//            localpic.showPic("AAA");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        ITestInterface it = new CTest();
        ClocalPicShow cpic2 = new ClocalPicShow(it);
        ITestInterface localpic2 = (ITestInterface)cpic2.getProxyInstance();
        localpic2.sendMessage("AAA");
    }
}
