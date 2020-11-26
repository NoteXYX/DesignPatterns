package strategyPattern;

import strategyPattern.Impl.FlyWithWings;
import strategyPattern.Impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a MallardDuck（绿头鸭）");
    }
}
