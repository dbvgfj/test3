package cumt.entity;

import cumt.dao.FlyBehavior;
import cumt.dao.QuackBehavior;

public class Duck {
	  FlyBehavior flyBehavior;//�ӿ�
      QuackBehavior quackBehavior;//�ӿ�
      public void setFlyBehavior(FlyBehavior flyBehavior){
          this.flyBehavior = flyBehavior;
      }
      public void setQuackBehavior(QuackBehavior quackBehavior)  {
          this.quackBehavior= quackBehavior;
      }
      public void swim() {  
          System.out.println("����Ѽ�Ӷ�����Ӿ");  
      }  
}
