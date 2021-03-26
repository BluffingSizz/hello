package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	static void print(Map map) {
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list");
		for(ProdEx p : list2) {
			System.out.println(p.getProduct()+"\t"+p.getNum()+"\t"+p.getCompany()+"\t"+p.getPrice()+"\t"+p.getAmount()+"\t"
					+p.getMoney());
		}
	}
	
	public static void main(String[] args) {
		List<ProdEx> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		list.add(new ProdEx("oledTV","lg01tv","LG",3000,10));
		list.add(new ProdEx("냉장고","sm02","삼성",2000,5));
		list.add(new ProdEx("에어콘","win03","위니아",1000,8));
		list.add(new ProdEx("컴퓨터","asus1","아수스",2000,6));
		map.put("list", list);
		
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("----------------------------------------------");
		print(map);
		System.out.println("----------------------------------------------");
	}

}
