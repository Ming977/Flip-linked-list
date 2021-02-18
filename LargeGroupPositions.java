package jan5;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {
	public static List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> list = new ArrayList<>();
		if(s.length() < 3) {
			return list;
		}
		int i = 0;
		int j = 0;
		for(i = 0,j = 0;i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(j)) {
				if(i - j >= 3) {
//					System.out.println("i:"+i+",j:"+j);
					List<Integer> ls = new ArrayList<Integer>();
					ls.add(Integer.valueOf(j));
					ls.add(Integer.valueOf(i-1));
					list.add(ls);
				}
				j = i;
			}
		}
//		System.out.println("i:"+i+",j:"+j);
		i--;
		if( s.charAt(i) == s.charAt(j) && i - j >= 2) {
			List<Integer> ls = new ArrayList<Integer>();
			ls.add(Integer.valueOf(j));
			ls.add(Integer.valueOf(i));
			list.add(ls);
		}
		return list;
    }
	public static void main(String[] args) {
		String s = "a";
		List<List<Integer>> list = largeGroupPositions(s);
		for(List<Integer> ls : list) {
			for(Object i:ls) {
				System.out.print(i+",");
			}
			System.out.println();
		}
	}
}
