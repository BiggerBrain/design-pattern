package behavioral.patterns.command.example;

/**
 * 命令模式用遥控器讲解比较简单易懂
 *
 * @author lishixiong
 */
public interface Commend {
    void execute();

    void undo();
}
