package Chapter03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue queue = new LinkedList<String>();

		queue.offer("둘리");
		queue.offer("마이콜");
		System.out.println(queue.size());//2개 넣었으니 2가 나옴

		System.out.println(queue.peek());	//둘리

		queue.offer("도우너");

		System.out.println(queue.poll());
		System.out.println(queue.size());

		while (queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}