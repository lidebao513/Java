
public class LoopTest {
	private int[] testArray = new int[]{2,4,3,5,1};
	
	public void testForLoop(){
		
		for (int i = 0; i < testArray.length; i ++){
			System.out.println(testArray[i]);
			if(testArray[i] ==3){
				continue;
			}
		}
	}
//	public void testForLoopEnhance(){
//		for (int i : testArray) {
//		System.out.println(i);
//		}
//	}
	
	public void testWhileLoop(){
		int index = 0 ;
		while(index < testArray.length){
			System.out.println(testArray[index]);
			index ++ ;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopTest t = new LoopTest();
		t.testForLoop();
//		t.testForLoopEnhance();
		t.testWhileLoop();
		
	}

}
