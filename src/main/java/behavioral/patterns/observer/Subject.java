package behavioral.patterns.observer;

/**
 * @author lishixiong
 */
public interface Subject {
     void registerObserver(Observer o);

     void removeObserver(Observer o);

     void notifyObserver();
}
