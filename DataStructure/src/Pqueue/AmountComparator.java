package Pqueue;

import java.util.Comparator;

public class AmountComparator implements Comparator<Orders> {

	@Override
	public int compare(Orders o1, Orders o2) {
		// TODO Auto-generated method stub
		return o2.getId()-o1.getId();
	}

}
