package com.shuaishuaide.set.Generic;

import java.util.*;

public class GenericTest01 {//

	public static void main(String[] args) {
		
		List<String> strs = new ArrayList<String>();
		
		strs.add("12");
		strs.add("13");
		strs.add("wo");//������Ȼ��������
		strs.add("16");
		strs.add("15");
		
		Collections.sort(strs);
		
		Iterator<String> it = strs.iterator();
		
		while(it.hasNext()){//���ﲻ�ô�Objectǿ������ת������Ϊ��Ȼ����ȥString������/ֱ�����в�����־�����Ϣ
			
			String s = it.next();
			System.out.println(s);

		}
		
		Map<String,Integer> maps = new HashMap<String,Integer>();
		
		maps.put("����1",10);
		maps.put("����2",10);
		maps.put("����3",10);
		maps.put("����4",10);
		
		//Collections.sort(maps);��������maps������
		
		Set<String> keys = maps.keySet();
		
		Iterator<String> it2 = keys.iterator();
		
		while(it2.hasNext()){
			String k = it2.next();
			System.out.print(k+" ");//����ת��
			System.out.println(maps.get(k));
		}
		
		
	}
	
	

}
