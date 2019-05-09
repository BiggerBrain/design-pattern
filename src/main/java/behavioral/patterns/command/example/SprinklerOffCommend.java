package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.Sprinkler;

/**
 * @author lishixiong
 */
public class SprinklerOffCommend implements Commend {
    Sprinkler sprinkler;

    public SprinklerOffCommend(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOff();
    }

    @Override
    public void undo() {
        sprinkler.waterOn();
    }
}
