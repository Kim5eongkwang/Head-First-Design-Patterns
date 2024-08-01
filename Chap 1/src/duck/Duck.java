package duck;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다.");
    }
    public abstract void display();
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior flyBehavior){
        flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        quackBehavior = quackBehavior;
    }
}
