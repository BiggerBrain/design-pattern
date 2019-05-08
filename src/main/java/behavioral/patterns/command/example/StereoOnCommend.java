package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.Stereo;

/**
 * @author lishixiong on 2017/11/10.
 */
public class StereoOnCommend implements Commend {
    Stereo stereo;

    public StereoOnCommend(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
