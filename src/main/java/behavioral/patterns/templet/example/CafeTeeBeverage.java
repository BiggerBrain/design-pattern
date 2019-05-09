package behavioral.patterns.templet.example;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public abstract class CafeTeeBeverage {
    private void boilWater() {
        log.info("boiling water");
    }

    private void pourInCup() {
        log.info("pourIn cup");
    }

    abstract void brew();

    abstract void addCondiments();

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (getSureCondiments()) {
            addCondiments();
        }
    }

    // 这个就是钩子方法
    public boolean getSureCondiments() {
        return true;
    }
}
