package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.Light;

/**
 * @author lishixiong
 */
public class LightOnCommend implements Commend {
    Light light;

    public LightOnCommend(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
