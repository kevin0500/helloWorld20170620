package a;


/** 
 * @ClassName: newLineDemo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author min04.wang
 * @date 2015-8-25 下午3:35:27  
 */
public class newLineDemo {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param args
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String br = "</br>";
		String str = "123456789";
//		int a = 3;
//		int b = str.length() / a;
//		System.out.println(b);
//		StringBuffer sb  = new StringBuffer();
//		for(int i = 0; i < b; i++) {
//			sb.append(str.substring(i * a, (i + 1) * a));
//			sb.append(",");
//		}
		System.out.println(addNewLine(str, 3) + "#");
		
		
	}
	
	private static String addNewLine(String str, int len) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		if (len == 0) {
			return str;
		}
		int newLineCnt = str.length() / len;
		if (newLineCnt == 0) {
			return str;
		}
		// 是否整除
		boolean divisible = (str.length() % len) == 0 ? true : false; 
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < newLineCnt; i++) {
			if (i == 0) {
				sb.append(str.substring(0, (i + 1) * len));
			} else {
				sb.append(",");
				sb.append(str.substring(i * len, (i + 1) * len));
			}
		}
		if (!divisible) {
			sb.append(",");
			sb.append(str.substring(newLineCnt * len, str.length()));
		}
		return sb.toString();
	}

}
