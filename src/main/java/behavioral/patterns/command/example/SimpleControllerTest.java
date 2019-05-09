package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.Light;

/**
 * @author lishixiong
 */
public class SimpleControllerTest {
    public static void main(String[] args) {
        SimpleController simpleController = new SimpleController();
        Commend commend = new LightOnCommend(new Light());
        simpleController.setSlot(commend);
        simpleController.pressButton();
    }
}
