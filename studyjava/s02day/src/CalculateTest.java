
public class CalculateTest {
	double b = 9.50;
	double c = 7.80;
	public double testAdd(){
		return b + c ;
		}
	public int testDel(){
		return (int) (b-c);
	}
	public long testDelRound(){
		return Math.round (b-c);
	}
	public double testMul(){
		return b*c;
	}
	public float testDiv(){
		return (float)(b/c);
	}
	public double testDivDouble(){
		return (double) 9/2;
	}
	public double testDivDou(){
		return (double) (9/2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateTest t =new CalculateTest();
		System.out.println(t.testAdd());
		System.out.println(t.testDel());
		System.out.println(t.testDelRound());
		System.out.println(t.testMul());
		System.out.println(t.testDiv());
		System.out.println(t.testDivDouble());
		System.out.println(t.testDivDou());
		}
	}

