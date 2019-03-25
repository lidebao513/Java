
public class StringDemo {
	private String demoString = "ceshilidebao";
	
	public void testString(){
		String dsg = demoString.concat("very good");
		System.out.println(dsg);
		int len = demoString.length();
		System.out.println(len);
		boolean eq = "lidebao".equals(demoString);
		System.out.println(eq);
		String sub = demoString.substring(5);
		System.out.println(sub);
		String subString = demoString.substring(5);
		System.out.println(subString);
		boolean sw = demoString.startsWith("ceshi");
		System.out.println(sw);
		boolean ew = demoString.endsWith("bao");
		System.out.println(ew);
		int subIndex = demoString.indexOf("li");
		System.out.println(subIndex);
		int lastIndex = demoString.lastIndexOf("w");
		System.out.println(lastIndex);
		System.out.println(demoString.toUpperCase());
		System.out.println(demoString.toLowerCase());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo s = new StringDemo();
		s.testString();
		
	}

}
