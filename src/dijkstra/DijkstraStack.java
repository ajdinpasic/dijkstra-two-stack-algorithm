package dijkstra;

public class DijkstraStack {
	
	private Node top;
	
	
	public void push(String value) {
		
		Node newNode=new Node();
		newNode.data=value;
		newNode.next=top;
		top=newNode;
		
		
	}
	public String pop() {
		String item=top.data;
		top=top.next;
		
		return item;
	}
	
	
	

}
