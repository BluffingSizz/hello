package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");//get("키")
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();//맵 인스턴스
		List<Student> list = new ArrayList<>();//리스트 인스턴스
		list.add(new Student("2017003", "kim", "전자", 3, "박교수"));
		list.add(new Student("2015009", "choi", "화학", 2, "이교수"));
		list.add(new Student("2019008", "lee", "수학", 4, "김교수"));
		map.put("list", list);//맵에 리스트 추가,put("키")
		
		print(map);
	}

}
