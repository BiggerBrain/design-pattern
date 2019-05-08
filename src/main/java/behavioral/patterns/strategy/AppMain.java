package behavioral.patterns.strategy;

/**
 * @author lishixiong on 2017/11/10.
 */
public class AppMain {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context(strategy);
        context.contextInterface();
        //环境不变，策略变更
        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        context.contextInterface();
        //环境变化，策略变化
        context = new Context(strategy);
        context.contextInterface();
    }
}
