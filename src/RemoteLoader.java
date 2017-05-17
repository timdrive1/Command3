/**
 * Created by student on 17.05.2017.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        CellingFan cellingFan = new CellingFan("LivingRoom");
        CellingFanMediumCommand cellingFanMedium = new CellingFanMediumCommand(cellingFan);
        CellingFanHighCommand cellingFanHigh = new CellingFanHighCommand(cellingFan);
        CellingFanOffCommand cellingFanOff = new CellingFanOffCommand(cellingFan);

        remoteControl.setOnCommand(0, cellingFanMedium, cellingFanOff);
        remoteControl.setOnCommand(1, cellingFanHigh, cellingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();






        
    }
}
