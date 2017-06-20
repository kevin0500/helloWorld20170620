package a;

/** 
 * @ClassName: ThrowTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author min04.wang
 * @date 2015-7-30 下午2:46:11 
 *  
 */
public class ThrowTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
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
