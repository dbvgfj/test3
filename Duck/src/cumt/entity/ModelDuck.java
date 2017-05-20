package cumt.entity;

import cumt.dao.impl.FlyNoWay;
import cumt.dao.impl.Quack;

public class ModelDuck extends Duck{
	 public ModelDuck() {  
	        flyBehavior = new FlyNoWay();  
	        quackBehavior = new Quack();  
	    }  
	  
	    public void display() {  
	        System.out.println("����ģ��Ѽ");  
	        flyBehavior.fly();
	        quackBehavior.quack();
	    }  
}
