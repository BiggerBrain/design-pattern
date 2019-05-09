
package behavioral.patterns.mediator;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月08日 11:32 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueHR hr = new ConcreteColleagueHR("招聘hr", mediator);
        ConcreteColleagueRD rd = new ConcreteColleagueRD("开发者", mediator);

        mediator.setHr(hr);
        mediator.setRd(rd);

        hr.constact("Hi，你有意向来我们公司吗？");
        rd.constact("是XXX公司吗？");
        hr.constact("yes!");
        rd.constact("我愿意！");


    }
}