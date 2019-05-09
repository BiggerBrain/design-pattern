package behavioral.patterns.command.example.entity;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class Stereo {
    public void on() {
        log.info("Stereo on!!!");
    }

    public void off() {
        log.info("Stereo off!!!");
    }

    public void setCD() {
        log.info("CD: love be long   FROM:mike jackson!!!");
    }

    public void setVolume(int volume) {
        log.info("VOLUME: volume has set" + volume);
    }
}
