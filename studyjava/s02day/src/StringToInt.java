
public class StringToInt {
	public Integer changeType(String s ){
		try{
			return Integer.valueOf(s);
		}catch(Exception e ){
			return null;
		}
			
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToInt t =new StringToInt();
		System.out.println(t.changeType("s"));
	}

}
