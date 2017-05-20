package cumt.entity;

import cumt.dao.impl.FlyNoWay;
import cumt.dao.impl.Squeak;

public class RubberDuck extends Duck{
	public RubberDuck() {  
        flyBehavior = new FlyNoWay();  
        quackBehavior = new Squeak();  
    }  
   
    public void display() {  
        System.out.println("������ƤѼ");  
        flyBehavior.fly();
        quackBehavior.quack();
    }  
}
