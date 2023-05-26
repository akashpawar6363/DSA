package Assignment;

public class Assignment_3_5 {
	Node head; 

	static class Node {

		int data;
		Node next;

		Node(int d) {     
			this.data = d;
			next = null;
		} 
	}
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	
	public static Node findBeginofloop(Node head) {
		Node fastptr = head;
		Node slowptr = head;
		boolean loopexists = false;
		while(fastptr !=null  && fastptr.next !=null) {
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			if(slowptr == fastptr) {
				loopexists = true;
				break;
			}
		}
		if(loopexists) {
			slowptr=head;
			while(slowptr != fastptr) {
				slowptr =slowptr.next;
				fastptr =fastptr.next;
			}
			return fastptr;
		}
		else
			return null;
		
	}
	
	

	
	public static void main(String[] args) {
		Assignment_3_5 llist = new Assignment_3_5();

		llist.head = new Node(1);
		Node s1 = new Node(2);
		Node s2 = new Node(3);
		Node s3 = new Node(4);
		Node s4 = new Node(5);
		Node s5 = new Node(6);
		Node s6 = new Node(7);
		Node s7 = new Node(8);
		Node s8 = new Node(9);
		Node s9 = new Node(12);
		Node s10 = new Node(14);

		llist.head.next = s1; 
		s1.next = s2; 
		s2.next = s3;
		s3.next = s4;
		s4.next = s5;
		s5.next = s6;
		s6.next = s7;
		s7.next = s8;
		s8.next = s9;
		s9.next = s10;
		s10.next = null;
		llist.printList();
		
	}

}
