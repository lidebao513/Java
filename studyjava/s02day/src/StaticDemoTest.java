
public class StaticDemoTest {
	static{
		System.out.println("hello");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo.USER_NAME);
		StaticDemo.USER_NAME = "testlidebao";
		System.out.println(StaticDemo.USER_NAME);
	}

}
