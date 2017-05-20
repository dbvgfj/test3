package cumt.dao.impl;

import cumt.dao.FlyBehavior;

public class FlyNoWay implements FlyBehavior{
	 public void  fly(){
	      //什么都不做，不会飞
		 System.out.println("不会飞");
	    }
}
