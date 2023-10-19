package com.sunbeam;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<StoreBook> st=new LinkedHashSet<>();
		
		st.add(new StoreBook("4545",400,"B",5));
		st.add(new StoreBook("2575",500,"C",2));
		st.add(new StoreBook("4545",600,"K",3));
		st.add(new StoreBook("8545",200,"I",4));
		st.add(new StoreBook("1545",400,"P",5));
		st.add(new StoreBook("6545",300,"O",7));
		
		Iterator<StoreBook> itr=st.iterator();
		while(itr.hasNext()) {
			StoreBook s=itr.next();
			System.out.println(s);
		}
	}

}

