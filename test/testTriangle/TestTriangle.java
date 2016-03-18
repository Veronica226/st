package testTriangle;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestTriangle {
	
	private int e1;
	private int e2;
	private int e3;
	private String expected;
	
	public TestTriangle(String expected,int e1,int e2,int e3){
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
		this.expected = expected;
	}
	
	
	@Parameters
	public static Collection<Object []> getData(){
		return Arrays.asList(new Object[][]{
				{"不是三角形",0,0,0},
				{"不是三角形",0,0,1},
				{"不是三角形",0,1,1},
				{"不是三角形",0,1,2},
				{"不是三角形",1,0,0},
				{"不是三角形",0,1,0},
				{"等边三角形",2,2,2},
				{"不是三角形",1,2,3},
				{"不是三角形",1,1,2},
				{"等腰三角形",4,4,5},
				{"等腰三角形",4,5,4},
				{"等腰三角形",5,4,4},
				{"直角三角形",3,4,5},
				{"直角三角形",9,40,41},
				{"普通三角形",5,6,7},
				{"普通三角形",2,4,5},
				{"不是三角形",8,3,4},
				{"不是三角形",-1,-1,-1},
				{"不是三角形",-1,-1,0},
				{"不是三角形",0,-1,0},
				{"不是三角形",-3,-4,-4},
				{"不是三角形",-3,-4,-5},
				{"不是三角形",-4,-5,-6}
				
				
		});
	}
	
	@Test
	public void testType(){
		TriangleType t = new TriangleType();
		assertEquals(this.expected,t.Decide(e1, e2, e3));
	}
	
	
}

