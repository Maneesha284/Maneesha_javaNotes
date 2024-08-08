package com.java8;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Map1 {

	public static void main(String[] args) {

		/*
		 * Map<String, List<Integer>> m = new HashMap(); m.put("sdadf", Arrays.asList(5,
		 * 3, 2, 5, 6, 8)); m.put("dffsfdfd", Arrays.asList(7, 3, 7, 2, 86, 43, 23));
		 * List<Integer> collect =
		 * m.values().stream().flatMap(List::stream).collect(Collectors.toList());
		 * System.out.println(collect);
		 */

		List<Integer> a = new ArrayList<>();
		a.add(32);
		a.add(234);
		a.add(63);
		a.add(34);
		a.add(78);
		a.add(63);
		a.add(34);
		a.add(63);
		a.add(34);
		a.add(78);
		List<Integer> a1 = new ArrayList<>();
		a1.add(32);
		
		a1.add(63);
		a1.add(34);
		a1.add(63);
		a1.add(34);
		a1.add(78);
		
		/*
		 * Map<String,List<Integer>> map1=new HashMap(); map1.put("ffd", a);
		 * map1.put("anu", a); System.out.println(map1);
		 */
		
		Map<List<Integer>,List<Integer>> map1=new HashMap();
		map1.put(a,a1);
		//map1.put(a.get(1));
		//map1.put(a1,a);
		System.out.println(map1);
		map1.entrySet();
		boolean set = map1.containsKey(map1);
		System.out.println(set);
		
		//  Set<Entry<List<Integer>, List<Integer>>> entrySet = map1.entrySet();
		/*
		 * for(Set<Entry<List<Integer>, List<Integer>>> entrySet :map1.entrySet()) {
		 * 
		 * }
		 */
		 
		/*
		 * Map<String,List<String>> map=new HashMap(); map.put("hi",
		 * Arrays.asList("aaa","sss","ddd")); map.put("hello",
		 * Arrays.asList("aaa","ttt","ppp")); Set<String> collect =
		 * map.values().stream().flatMap(List::stream).collect(Collectors.toSet());
		 * System.out.println(collect);
		 */

		/*
		 * Map<List<String>,String> map1=new HashMap();
		 * map1.put(Arrays.asList("aaa","sss","ddd"),"hi");
		 * map1.put(Arrays.asList("aaa","ttt","ppp","iii"),"hello"); Set<String> collect
		 * = map1.keySet().stream().flatMap(List::stream).collect(Collectors.toSet());
		 * System.out.println(collect);
		 */

		/*
		 * Map<List<Integer>,List<Integer>> map1=new HashMap();
		 * map1.put(Arrays.asList(7,3,43,23),Arrays.asList(7,3,7,2,86,43,23));
		 * map1.put(Arrays.asList(1,2,3,4,5),Arrays.asList(11,22,33,4,8));
		 * Set<Entry<List<Integer>, List<Integer>>> set =
		 * map1.entrySet().stream().collect(Collectors.toSet());
		 * System.out.println(set);
		 */
	}

}
