package StrategyPattern.Impl;

import StrategyPattern.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings!");
    }
}
