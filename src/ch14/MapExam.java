package ch14;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("한국", "서울");//맵.put(key,value)
		System.out.println(map.get("한국"));
		map.put("일본", "동경");
		map.put("중국", "북경");
		map.put("미국", "워싱턴");
		map.put("태국", "방콕");
		map.put("영국", "런던");
		System.out.println(map);
		String nation ="영국";
		System.out.println(map.get(nation));
	}

}
