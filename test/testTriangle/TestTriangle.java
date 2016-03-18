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
				{"����������",0,0,0},
				{"����������",0,0,1},
				{"����������",0,1,1},
				{"����������",0,1,2},
				{"����������",1,0,0},
				{"����������",0,1,0},
				{"�ȱ�������",2,2,2},
				{"����������",1,2,3},
				{"����������",1,1,2},
				{"����������",4,4,5},
				{"����������",4,5,4},
				{"����������",5,4,4},
				{"ֱ��������",3,4,5},
				{"ֱ��������",9,40,41},
				{"��ͨ������",5,6,7},
				{"��ͨ������",2,4,5},
				{"����������",8,3,4},
				{"����������",-1,-1,-1},
				{"����������",-1,-1,0},
				{"����������",0,-1,0},
				{"����������",-3,-4,-4},
				{"����������",-3,-4,-5},
				{"����������",-4,-5,-6}
				
				
		});
	}
	
	@Test
	public void testType(){
		TriangleType t = new TriangleType();
		assertEquals(this.expected,t.Decide(e1, e2, e3));
	}
	
	
}

