package Chapter03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue queue = new LinkedList<String>();

		queue.offer("�Ѹ�");
		queue.offer("������");
		System.out.println(queue.size());//2�� �־����� 2�� ����

		System.out.println(queue.peek());	//�Ѹ�

		queue.offer("�����");

		System.out.println(queue.poll());
		System.out.println(queue.size());

		while (queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}