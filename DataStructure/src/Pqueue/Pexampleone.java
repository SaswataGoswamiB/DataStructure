package Pqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Pexampleone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pa=new PriorityQueue<Integer>();
		pa.add(6);
		pa.add(1);
		pa.add(2);
		pa.add(4);
		System.out.println(pa);
		
		PriorityQueue<Integer> pa=new PriorityQueue<Integer>(Comparator.reverseOrder());
		pa.add(6);
		pa.add(1);
		pa.add(2);
		pa.add(4);
		System.out.println(pa);
//		
		

		PriorityQueue<Integer> pa=new PriorityQueue<Integer>();
		pa.add(6);
		pa.add(1);
		pa.add(2);
		pa.add(4);
		pa.poll();
		System.out.println(pa);
		
		//implementation of minHeap for Pqueue
		//in case of Custom Class.
		
		PriorityQueue<Orders> paoddOrders=new PriorityQueue<Orders>();
		paoddOrders.add(new Orders("GluconD",12));
		paoddOrders.add(new Orders("Hot Choclate",11));
		paoddOrders.add(new Orders("NotrBook",32));
		paoddOrders.add(new Orders("Biscuit",1));
		
		System.out.println(paoddOrders);
		
		//implementation of maxHeap for Pqueue
		// in case of Custom class.
		
		PriorityQueue<Orders> paoddOrders=new PriorityQueue<Orders>(new AmountComparator());
		paoddOrders.add(new Orders("GluconD",12));
		paoddOrders.add(new Orders("Hot Choclate",11));
		paoddOrders.add(new Orders("NotrBook",32));
		paoddOrders.add(new Orders("Biscuit",1));
		
		System.out.println(paoddOrders);
		
	}

}
