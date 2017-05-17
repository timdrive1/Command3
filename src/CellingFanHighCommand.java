/**
 * Created by student on 17.05.2017.
 */
public class CellingFanHighCommand implements Command{
    CellingFan cellingFan;
    int prevSpeed;
    public CellingFanHighCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
    }
    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }
    public void undo(){
        if(prevSpeed == CellingFan.HIGH){
            cellingFan.high();
        }
        else if(prevSpeed == CellingFan.MEDIUM){
            cellingFan.medium();
        }
        else  if(prevSpeed == CellingFan.LOW){
            cellingFan.low();
        }
        else if(prevSpeed == CellingFan.OFF){
            cellingFan.off();
        }
    }
}
