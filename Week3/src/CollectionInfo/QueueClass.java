package CollectionInfo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();

		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		q.add("e");

		System.out.println(q);

		Deque<String> dq = new LinkedList<>();

		dq.add("a");
		dq.addFirst("aa");
		dq.add("a");
		dq.add("a");
		dq.addLast("xx");

		dq.add("v");
		
//		dq.remove();
//		dq.removeLast();

		System.out.println(dq);

	}
}
