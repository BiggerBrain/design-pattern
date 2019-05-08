package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.CeilingFan;
import behavioral.patterns.observer.DisplayElement;

/**
 * @author lishixiong on 2017/11/10.
 */
public class CeilingFanHighCommend implements Commend {
    CeilingFan ceilingFan;
    int        speed;

    public CeilingFanHighCommend(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    /**
     * @see DisplayElement
     */
    @Override
    public void undo() {
        if (speed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (speed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (speed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (speed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
