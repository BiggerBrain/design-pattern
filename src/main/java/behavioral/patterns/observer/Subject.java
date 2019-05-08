package behavioral.patterns.observer;

/**
 * @author lishixiong on 2017/11/10.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
