package structural.patterns.facade.example;

/**
 * @author lishixiong on 2017/11/11.
 */
public class AppMain {
    public static void main(String[] args) {
        Computer computer = new Computer(new Cpu(), new Memory(), new Disk());
        computer.startup();
        computer.shutdown();
    }
}
