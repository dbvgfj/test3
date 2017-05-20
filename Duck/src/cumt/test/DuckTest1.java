package cumt.test;

import cumt.entity.MallardDuck;
import cumt.entity.ModelDuck;
import cumt.entity.RedHeadDuck;
import cumt.entity.RubberDuck;

public class DuckTest1 {
	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();  
        RubberDuck  rubberDuck = new RubberDuck();  
        RedHeadDuck redHeadDuk = new RedHeadDuck();  
        ModelDuck   model = new ModelDuck();  
  
        mallard.display();  
        rubberDuck.display();  
        redHeadDuk.display();
        model.display();   
	}
}
