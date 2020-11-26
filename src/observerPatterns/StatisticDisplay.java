package observerPatterns;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer, DisplayElements {
    Observable observable;
    private int times;
    private float sumTem;
    private float maxTem;
    private float minTem;

    public StatisticDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void display() {

    }
}
