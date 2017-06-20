package a;

import java.util.HashMap;
import java.util.Map;

/** 
 * @ClassName: MapDemo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author min04.wang
 *  
 */
public class MapDemo {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param args
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dMap = new HashMap<String, String>();
		dMap.put("", "blank");
		dMap.put("01", "第三方");
		dMap.put("02", "代理商兼第三方");
		dMap.put(null, "nullName");
		dMap.put(null, "nullName2");
		for(Map.Entry<String, String> s : dMap.entrySet()) {
			System.out.println("key=[" + s.getKey() + "];value=[" + s.getValue() + "]");
		}
		System.out.println(dMap.get(null));
		System.out.println(dMap.get(""));
	}
}

