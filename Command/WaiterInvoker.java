package Command;

import java.util.ArrayList;

public class WaiterInvoker {
    private ArrayList<Command> commands=null;
    public WaiterInvoker(){
        commands=new ArrayList<Command>();
    }
    public void setCommands(Command command){
        commands.add(command);
    }
    public void orderup(){
        System.out.println("ж");
        for(Command command:commands){
            if(command!=null){
                command.execute();
            }
        }
    }
}
