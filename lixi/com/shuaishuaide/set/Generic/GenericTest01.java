package com.shuaishuaide.set.Generic;

import java.util.*;

public class GenericTest01 {//

	public static void main(String[] args) {
		
		List<String> strs = new ArrayList<String>();
		
		strs.add("12");
		strs.add("13");
		strs.add("wo");//这里仍然可以排序
		strs.add("16");
		strs.add("15");
		
		Collections.sort(strs);
		
		Iterator<String> it = strs.iterator();
		
		while(it.hasNext()){//这里不用从Object强制类型转换，因为必然传进去String类型呢/直接运行不会出现警告信息
			
			String s = it.next();
			System.out.println(s);

		}
		
		Map<String,Integer> maps = new HashMap<String,Integer>();
		
		maps.put("西瓜1",10);
		maps.put("西瓜2",10);
		maps.put("西瓜3",10);
		maps.put("西瓜4",10);
		
		//Collections.sort(maps);不能用在maps的排序
		
		Set<String> keys = maps.keySet();
		
		Iterator<String> it2 = keys.iterator();
		
		while(it2.hasNext()){
			String k = it2.next();
			System.out.print(k+" ");//无需转型
			System.out.println(maps.get(k));
		}
		
		
	}
	
	

}
