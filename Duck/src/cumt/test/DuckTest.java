package cumt.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cumt.entity.MallardDuck;
import cumt.entity.ModelDuck;
import cumt.entity.RedHeadDuck;
import cumt.entity.RubberDuck;

public class DuckTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
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
	


