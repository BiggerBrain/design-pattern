package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.Stereo;

/**
 * @author lishixiong on 2017/11/10.
 */
public class StereoOffCommend implements Commend {
    Stereo stereo;

    public StereoOffCommend(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
