package a;

/** 
 * @ClassName: ThrowTest 
 * @Description: TODO(������һ�仰��������������) 
 * @author min04.wang
 * @date 2015-7-30 ����2:46:11 
 *  
 */
public class ThrowTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(������һ�仰�����������������) 
	 * @param args
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int array[] = {1,2,3,4,5};
//		for(int i : array) {
//			if (i == 3) {
//				throw new RuntimeException("test runtime msg!");
//			}
//			System.out.println(i);
//		}
		try {
			method();
		} catch (Exception e) {
			//
		}
	}
	
	private static void method() {
		int array[] = {1,2,3,4,5};
		for(int i : array) {
			if (i == 3) {
				throw new RuntimeException("test runtime msg!");
			}
			System.out.println(i);
		}
	}

}
