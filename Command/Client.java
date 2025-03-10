package Command;

public class Client {
    public static void main(String[] args) {
        Order order1=new Order();
        order1.setId(1);
        order1.setFruitmap("ƻ",1);
        order1.setFruitmap("",2);
        order1.setFruitmap("㽶",3);

        Order order2=new Order();
        order2.setId(2);
        order2.setFruitmap("",5);
        order2.setFruitmap("",2);
        order2.setFruitmap("",3);

        Operator op=new Operator();
        OrderCommand orderCommand=new OrderCommand(op,order1);
        OrderCommand orderCommand2=new OrderCommand(op,order2);

        WaiterInvoker waiter=new WaiterInvoker();
        waiter.setCommands(orderCommand);
        waiter.setCommands(orderCommand2);

        waiter.orderup();
    }
}
