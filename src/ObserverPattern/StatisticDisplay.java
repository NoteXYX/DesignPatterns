package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer, DisplayElements {
    Observable observable;
    private int times;
    private float sumTem;
    private float maxTem = Float.MIN_VALUE;
    private float minTem = Float.MAX_VALUE;

    public StatisticDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float tem = weatherData.getTemperature();
            times += 1;
            sumTem += tem;
            if (tem > maxTem) {
                maxTem = tem;
            }
            if (tem < minTem) {
                minTem = tem;
            }
            display();
        }
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f %n", sumTem/times, maxTem, minTem);
    }
}
