package DProxy;

import Proxy.CRemoPic;
import Proxy.IshowPic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ClocalPicShow{
    private Object target;
    public ClocalPicShow(Object target){
        super();
        this.target=target;
    }
  public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("׼ͼƬ"+args[0]);
                Thread thread=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            method.invoke(target,args);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        } catch (InvocationTargetException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
                thread.start();
                return null;
            }
        });
  }
}
