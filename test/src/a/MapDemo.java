package a;

import java.util.HashMap;
import java.util.Map;

/** 
 * @ClassName: MapDemo 
 * @Description: TODO(������һ�仰��������������) 
 * @author min04.wang
 *  
 */
public class MapDemo {

	/** 
	 * @Title: main 
	 * @Description: TODO(������һ�仰�����������������) 
	 * @param args
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dMap = new HashMap<String, String>();
		dMap.put("", "blank");
		dMap.put("01", "������");
		dMap.put("02", "�����̼������");
		dMap.put(null, "nullName");
		dMap.put(null, "nullName2");
		for(Map.Entry<String, String> s : dMap.entrySet()) {
			System.out.println("key=[" + s.getKey() + "];value=[" + s.getValue() + "]");
		}
		System.out.println(dMap.get(null));
		System.out.println(dMap.get(""));
	}
}

