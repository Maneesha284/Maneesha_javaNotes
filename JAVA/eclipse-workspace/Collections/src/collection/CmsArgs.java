package collection;

import java.util.Arrays;
import java.util.List;

public class CmsArgs {

	public static void main(String[] args) {
		
		String str[]= {"anu","nithya","mani"};
		List<String> list=Arrays.asList(str);
		list.forEach(x->System.out.println(x));
		
		System.out.println("FOR EACH");
		for(String m:list) {
			System.out.println(m);
		}
	}

}
