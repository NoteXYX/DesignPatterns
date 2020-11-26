package strategyPattern.Impl;

import strategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<mute>>");
    }
}
