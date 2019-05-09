package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.Light;

/**
 * @author lishixiong
 */
public class LightOffCommend implements Commend {
    Light light;

    public LightOffCommend(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
