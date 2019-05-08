package behavioral.patterns.command.example;

/**
 * @author lishixiong on 2017/11/10.
 */
public class RemoteController {
    Commend[] onCommends;
    Commend[] offCommends;
    Commend   undoCommend;

    public RemoteController() {
        onCommends = new Commend[7];
        offCommends = new Commend[7];
        Commend noCommend = new NoCommend();
        for (int i = 0; i < 7; i++) {
            onCommends[i] = noCommend;
            offCommends[i] = noCommend;
        }
        undoCommend = noCommend;
    }

    public void setCommend(int slot, Commend onCommend, Commend offCommend) {
        onCommends[slot] = onCommend;
        offCommends[slot] = offCommend;
    }

    public void onButtonPushed(int slot) {
        onCommends[slot].execute();
        undoCommend = onCommends[slot];
    }

    public void offButtonPushed(int slot) {
        offCommends[slot].execute();
        undoCommend = offCommends[slot];
    }

    public void undoButtonPushed() {
        undoCommend.undo();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----Remote Controller----\n");
        for (int i = 0; i < onCommends.length; i++) {
            sb.append("slot[" + i + "]" + onCommends[i].getClass().getName() + "\t" + offCommends.getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
