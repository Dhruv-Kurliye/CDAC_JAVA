package day7;

import java.util.Comparator;

public class NameComparator implements Comparator <Toy>{

	@Override
	public int compare(Toy o1, Toy o2) {
		
		return o1.getToy_ID().compareTo(o2.getToy_ID());
	}

}
