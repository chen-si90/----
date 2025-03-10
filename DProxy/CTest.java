package DProxy;

public class CTest implements ITestInterface{
    @Override
    public void sendMessage(String mes) {
        for (int i = 5; i >0 ; i--) {
            System.out.println(mes+"怪物的出现还有"+i+"秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(mes+"怪物出现");
    }
}
