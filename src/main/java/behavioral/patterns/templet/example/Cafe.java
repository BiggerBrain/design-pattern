package behavioral.patterns.templet.example;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

/**
 * @author lishixiong
 */
@Log4j2
public class Cafe extends CafeTeeBeverage {
    @Override
    void brew() {
        log.info("drop cafe");
    }

    @Override
    void addCondiments() {
        log.info("add sugar and milk");
    }

    @Override
    public boolean getSureCondiments() {
        return getUserInput();
    }

    boolean getUserInput() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        log.info("if you want Condiments please enter Y !!!");
        return str.equalsIgnoreCase("Y");
    }

    private void sss() {
        log.info("------------------------------");
    }
}
