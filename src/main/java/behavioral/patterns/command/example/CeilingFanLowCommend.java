package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.CeilingFan;

/**
 * @author lishixiong on 2017/11/10.
 */
public class CeilingFanLowCommend implements Commend {
    CeilingFan ceilingFan;
    int        speed;

    public CeilingFanLowCommend(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

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
