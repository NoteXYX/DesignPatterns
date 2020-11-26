package strategyPattern.Impl;

import strategyPattern.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("咕咕叫");
    }
}
