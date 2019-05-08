package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.Sprinkler;

/**
 * @author lishixiong on 2017/11/10.
 */
public class SprinklerOnCommend implements Commend {
    Sprinkler sprinkler;

    public SprinklerOnCommend(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOn();
    }

    @Override
    public void undo() {
        sprinkler.waterOff();
    }
}
