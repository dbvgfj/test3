package cumt.entity;

import cumt.dao.impl.FlyWithWings;
import cumt.dao.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {       
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
      //��ΪMallardDuck �̳���Duck�����о���flyBehavior ��quackBehavior ʵ������
	}
    public void display(){
     //ʵ��
    	System.out.println("����ҰѼ");
    	flyBehavior.fly();
    	quackBehavior.quack();
   }
}
