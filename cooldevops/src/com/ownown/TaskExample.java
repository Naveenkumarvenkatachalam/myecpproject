
package com.ownown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

public class TaskExample  {
public static void main(String[] args) {
	
     HashMap< Integer, String> mapingex = new HashMap<Integer, String>();
     mapingex.put(1, "naveen");
     mapingex.put(2, "kumar");
     mapingex.put(3, "murugan");
     mapingex.put(4, "hanuman");
     Set<Integer> keke=mapingex.keySet();
     Collection<String> kese= mapingex.values();
     ArrayList<String>arlist = new ArrayList<String>(kese);
     ArrayList<Integer>arnum = new ArrayList<Integer>(keke);
     System.out.println(arlist);
     System.out.println(arnum);
     }
}
