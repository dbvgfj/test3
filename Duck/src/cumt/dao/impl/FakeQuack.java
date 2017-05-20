package cumt.dao.impl;

import cumt.dao.QuackBehavior;

public class FakeQuack implements QuackBehavior{
	 public void quack(){
	      //实现假的鸭子
		 System.out.println("会假叫");
	  }
}
