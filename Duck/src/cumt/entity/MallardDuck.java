package cumt.entity;

import cumt.dao.impl.FlyWithWings;
import cumt.dao.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {       
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
      //因为MallardDuck 继承了Duck，所有具有flyBehavior 与quackBehavior 实例变量
	}
    public void display(){
     //实现
    	System.out.println("我是野鸭");
    	flyBehavior.fly();
    	quackBehavior.quack();
   }
}
