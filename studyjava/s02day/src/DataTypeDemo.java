
public class DataTypeDemo {
	public int b = 10;
	public void test(int b){
		b = 19;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypeDemo d = new DataTypeDemo();
		d.test(d.b);
		System.out.println(d.b);
	}

}
