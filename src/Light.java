/**
 * Created by Тим on 23.05.2017.
 */
public class Light {
    boolean isOn;
    public void on(){
        isOn = true;
        System.out.println("Light is on");
    }
    public  void off(){
        isOn = false;
        System.out.println("Light is off");
    }
}
