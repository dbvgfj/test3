package cumt.entity;

import cumt.dao.impl.FlyWithWings;
import cumt.dao.impl.Quack;
import cumt.entity.Duck;

public class RedHeadDuck extends Duck{
	public RedHeadDuck() {       
		flyBehavior = new FlyWithWings();  
		quackBehavior = new Quack();  
	}
    public void display(){
    	System.out.println("���Ǻ�ͷѼ");
    	flyBehavior.fly();
    	quackBehavior.quack();
   }
}
