package a;

/** 
 * @ClassName: DoubleTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author min04.wang
 * @date 2015-7-28 下午3:05:43 
 *  
 */
public class DoubleTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d1 = new Double("1.0");
		Double d2 = new Double("1.00");
		Double d3 = new Double("1");
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		
		String str1 = "2";
		String str2 = "2.0";
		String str3 = "2.00";
		
		System.out.println("123456789");
		
	}
}

