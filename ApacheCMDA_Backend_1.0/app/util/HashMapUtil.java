package util;

import java.util.HashMap;
import java.util.Map;

public class HashMapUtil {
	
	public static Map<String, Object> map(String key1, Object value1, String key2,
			Object value2) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		result.put(key1, value1);
		result.put(key2, value2);
		return result;
	}
	
	public static Map<String, Object> map5(String key1, Object value1, String key2,
			Object value2, String key3, Object value3, String key4, Object value4,
			String key5, Object value5) {
		Map<String, Object> result = new HashMap<String, Object>(5);
		result.put(key1, value1);
		result.put(key2, value2);
		result.put(key3, value3);
		result.put(key4, value4);
		result.put(key5, value5);
		return result;
	}
	
	public static Map<String, Object> map6(String key1, Object value1, String key2,
			Object value2, String key3, Object value3, String key4, Object value4,
			String key5, Object value5, String key6, Object value6) {
		Map<String, Object> result = new HashMap<String, Object>(6);
		result.put(key1, value1);
		result.put(key2, value2);
		result.put(key3, value3);
		result.put(key4, value4);
		result.put(key5, value5);
		result.put(key6, value6);
		return result;
	}

	public static Map<String, Object> map7(String key1, Object value1, String key2,
			Object value2, String key3, Object value3, String key4,
			Object value4, String key5, Object value5, String key6,
			Object value6, String key7, Object value7) {
		Map<String, Object> result = new HashMap<String, Object>(7);
		result.put(key1, value1);
		result.put(key2, value2);
		result.put(key3, value3);
		result.put(key4, value4);
		result.put(key5, value5);
		result.put(key6, value6);
		result.put(key7, value7);
		return result;
	}
}
