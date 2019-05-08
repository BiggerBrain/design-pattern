package behavioral.patterns.command.example;

/**
 * 命令模式用遥控器讲解比较简单易懂
 *
 * @author lishixiong on 2017/11/10.
 */
public interface Commend {
    void execute();

    void undo();
}
