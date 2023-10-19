package com.sunbeam;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		
		class StoreComparator implements Comparator<StoreBook>{
            @Override
			public int compare(StoreBook s1, StoreBook s2) {
				int diff=Double.compare(s1.getPrice(), s2.getPrice());
				return diff;
			}
		}
		StoreComparator ss=new StoreComparator();
		TreeSet<StoreBook> st=new TreeSet<>(ss);
		
		st.add(new StoreBook("4545",400,"B",5));
		st.add(new StoreBook("2575",500,"C",2));
		st.add(new StoreBook("4545",600,"K",3));
		st.add(new StoreBook("4545",200,"I",4));
		st.add(new StoreBook("1545",400,"P",5));
		st.add(new StoreBook("6545",300,"O",7));
		
		Iterator<StoreBook> itr=st.iterator();
		while(itr.hasNext()) {
			StoreBook s=itr.next();
			System.out.println(s);
		}
		Iterator<StoreBook> itr1=st.descendingIterator();
		while(itr1.hasNext()) {
			StoreBook s=itr1.next();
			System.out.println(s);
		}
	}

}


