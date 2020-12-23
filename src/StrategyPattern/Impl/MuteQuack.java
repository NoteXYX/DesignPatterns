package StrategyPattern.Impl;

import StrategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<mute>>");
    }
}
