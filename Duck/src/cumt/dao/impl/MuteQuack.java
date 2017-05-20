package cumt.dao.impl;

import cumt.dao.QuackBehavior;

public class MuteQuack implements QuackBehavior{
	public void quack(){
	      //什么都不做，不会叫
		System.out.println("不会叫");
	  }
}
