package cumt.entity;

import cumt.dao.FlyBehavior;
import cumt.dao.QuackBehavior;

public class Duck {
	  FlyBehavior flyBehavior;//接口
      QuackBehavior quackBehavior;//接口
      public void setFlyBehavior(FlyBehavior flyBehavior){
          this.flyBehavior = flyBehavior;
      }
      public void setQuackBehavior(QuackBehavior quackBehavior)  {
          this.quackBehavior= quackBehavior;
      }
      public void swim() {  
          System.out.println("所有鸭子都会游泳");  
      }  
}
