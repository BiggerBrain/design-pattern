package behavioral.patterns.command.example;

/**
 * @author lishixiong on 2017/11/10.
 */
public class SimpleController {
    Commend slot;

    public SimpleController() {
    }

    public void setSlot(Commend slot) {
        this.slot = slot;
    }

    public void pressButton() {
        slot.execute();
    }
}
