package behavioral.patterns.command.example.entity;

import lombok.extern.log4j.Log4j2;

/**
 * 电风扇
 *
 * @author lishixiong
 */
@Log4j2
public class CeilingFan {
    public static final int HIGH   = 3;
    public static final int MEDIUM = 2;
    public static final int LOW    = 1;
    public static final int OFF    = 0;
    String local;
    int    speed;

    public CeilingFan(String local) {
        this.local = local;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        log.info("this fan was high,speed = " + getSpeed());
    }

    public void medium() {
        speed = MEDIUM;
        log.info("this fan was medium,speed = " + getSpeed());
    }

    public void low() {
        speed = LOW;
        log.info("this fan was low,speed = " + getSpeed());
    }

    public void off() {
        speed = OFF;
        log.info("this fan was off,speed = " + getSpeed());
    }

    public int getSpeed() {
        return speed;
    }
}
