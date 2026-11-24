package lab9;

public class main {

	public static void main(String[] args) {
	
		PriorityQueue p = new PriorityQueue();
		PriorityQueue other = new PriorityQueue();
		
		p.enqueue(10);
		p.enqueue(30);
		p.enqueue(40);
		p.enqueue(50);
		
		System.out.println("PQ:");
		p.display();
		System.out.println();
		System.out.print("peek"+ p.peek());
		System.out.println();
		System.out.println("Dequeue: "+p.dequeue());
		System.out.println("PQ after dequeue: ");
		p.display();
		System.out.println("PQ after enqueue 20");
		p.enqueue(20);
	    p.display();
	    System.out.println("PQ after removing 40: ");
	    p.removeElement(40);
	    p.display();
	    System.out.println("Max Element: "+p.maxElement());
	    System.out.println("PQ2: ");
	    other.display();
	    System.out.println("PQ after merging: ");
	    p.merge(other);
	    p.display();
	    System.out.println("PQ after removing duplicates: ");
	    p.removeDuplicates();
	    p.display();
	    System.out.println("Remove lowest priority: "+ p.removeLowestPriority());
	    System.out.println("PQ after removing the lowest priority: ");
	    p.display();
	    
	    
	}

}
