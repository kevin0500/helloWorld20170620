package a;

import java.util.HashMap;
import java.util.Map;

/** 
 * @ClassName: MapDemo2 
 * @Description: TODO(������һ�仰��������������) 
 * @author min04.wang
 * @date 2015-8-18 ����2:53:14  
 */
public class MapDemo2 {

	/** 
	 * @Title: main 
	 * @Description: TODO(������һ�仰�����������������) 
	 * @param args
	 * @throws 
	 */
	public static void main(String[] args) {
		Map<String, String> dMap = new HashMap<String, String>();
		dMap.put("1", "a");
		Map<String, String> dMap2 = new HashMap<String, String>();
		dMap2.put("11", "aa");
		dMap2.put("22", "bb");
		dMap.putAll(dMap2);
		for(Map.Entry<String, String> elem : dMap.entrySet()) {
			System.out.println(elem.getKey() + ":" + elem.getValue());
		}
	}

}
