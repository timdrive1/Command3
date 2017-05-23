/**
 * Created by Тим on 23.05.2017.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){
    }
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
