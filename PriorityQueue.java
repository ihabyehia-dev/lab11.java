package lab9;

public class PriorityQueue extends LinkedList {

	PriorityQueue() {
		super();
	}

	void enqueue(int x) {
		Node n = new Node(x);
		Node current = front;

		if (isEmpty()) {
			front = n;
			rear = n;
		}

		else if (x < front.data) {
			n.next = front;
			front = n;
		}

		while (current.next != null && x < current.next.data) {
			current = current.next;
		}
		if (current.next == null) {
			rear = n;
		} else {
			n.next = current;
		}
	}

	public int dequeue() {
		return removeFirst();
	}

	public int peek() {
		return front.data;
	}

	public void display() {
		Node current = front;

		System.out.print("The elements of the queue: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public boolean removeElement(int x) {
		boolean ok = false;
		Node current = front;
		while (current != null) {
			if (current.data == x) {
				return ok = true;
			}
		}

		while (current.next != null && current.next.data != x) {
			current = current.next;
		}

		current.next = current.next.next;

		return ok;
	}

	public int maxElement() {
		return rear.data;
	}

	public int removeLowestPriority() {
		int x = rear.data;
		Node current = front;
		while (current != rear) {
			current = current.next;
		}
		current.next = null;
		return x;
	}

	void merge(PriorityQueue other) {

		Node currentother = other.front;
		while (currentother != null) {
			enqueue(currentother.data);
			currentother = currentother.next;
		}
	}

	void removeDuplicates() {
		Node current1 = front;
		Node current2 = front.next;

		while (current1 != null) {

			while (current2 != null && current2.next.data != current1.data) {
				current2 = current2.next;
			}
			current2.next = current2.next.next;
			current1 = current1.next;
		}
	}
	

}
