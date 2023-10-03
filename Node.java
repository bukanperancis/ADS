public class Node {
	public int num;
	public Node nextNode;
	
	public Node(int num, Node next) {
		this.num = num;
		nextNode = next;
	}
	
	public int getNum() {
		return num;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public String toString() {
		return "node is: " + num;
	}
	
	public static void main (String[] args) {
		Node node1 = new Node (5, null);
		Node node2 = new Node (10, null);
		Node node3 = new Node (15, null);
		
		node1.nextNode = node2;
		node2.nextNode = node3;
		
		System.out.println("The first node is: " +node1.getNum());
		System.out.println("The next " +node1.nextNode);
		
		System.out.println("\nThe second node is: " +node2.getNum());
		System.out.println("The next " +node2.nextNode);
		
		System.out.println("\nThe third node is: " +node3.getNum());
		System.out.println("The next node is: " +node3.nextNode);
    }
}