import java.util.*;




public class list {
	public void listAction(){
		List list = new ArrayList(); 
		list.add("a");//增加一个元素
		int len = list.size();//获取list的大小，即元素个数
		System.out.println(len);
		String s = (String) list.get(0);
		System.out.println(s);
		list.set(0, "b");
		System.out.println(list);
		boolean c = list.contains("a");
		System.out.println(c);
		List ll =new ArrayList();
		ll.add("c");
		list.addAll(ll);
		System.out.println(list);
	}
	public void loopList(){
		List list = new ArrayList();
		list.add(3, list);
		list.add(1, list);
		list.add(2, list);
		for (int i = 0 ; i < list.size(); i ++){
			System.out.println(list.get(i));
		}
			}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list l = new list();
//		l.listAction();
		l.loopList();
		
		
	}

}
