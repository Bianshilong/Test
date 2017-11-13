package com.bsl.test;

public abstract class Test {

	public static void main(String[] args) {
		
		String str = "duoxuan=6&duoxuan=7";
		String[] st = new String(str).split("&");
		for (int i = 0; i < st.length; i++) {
			st[i] = st[i].substring(8);
			System.out.println(st[i]);
		}
		
		String ids = "";
		for (int i = 0; i < st.length; i++) {
			ids = ids+st[i]+",";
		}
		ids=ids.substring(0, ids.length()-1);
		System.out.println(str);
		System.out.println(ids);
	}

}
