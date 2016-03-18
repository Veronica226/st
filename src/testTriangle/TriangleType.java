package testTriangle;

public class TriangleType {
	
	public String Decide(int e1,int e2,int e3){
		if(e1 > 0 && e2 > 0 && e3 > 0 && e1<e2+e3 && e2<e1+e3 && e3<e1+e2){
			if(e1*e1 == e2*e2 + e3*e3 || 
					e2*e2 == e1*e1 +e3*e3 || e3*e3 == e1*e1 +e2*e2){
				return "直角三角形";
			}else if(e1==e2 || e2 == e3 || e1 == e3){
				if(e1 == e2 && e2 == e3){
					return "等边三角形";
				}else{
					return "等腰三角形";
				}
			}else {
				return "普通三角形";
			}
		}else{
			return "不是三角形";
		}
	}
	
}
