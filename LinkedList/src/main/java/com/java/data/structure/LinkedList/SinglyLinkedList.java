package com.java.data.structure.LinkedList;

public class SinglyLinkedList {
	
	public static void main(String[] args) throws PositionOutOfBoundException {
		
		LinkedList list=new LinkedList();
		
		/*list.deleteAtEnd();
		list.deleteFromStart();
		list.deleteAtPos(2);*/
		
		list.insertAtStart(10);
		list.insertAtEnd("Rahat");
		list.insertAtStart("Raja");
		list.insertAtEnd(5.6);
		list.insertAtPos(1, "Raat");
		list.insertAtPos(1, new TestVo());
		
		list.deleteAtEnd();
		list.deleteFromStart();
		list.deleteAtPos(2);
		
		list.insertAtPos(3, "Mussu");
		list.deleteAtPos(3);
		list.deleteAtPos(3);
		
		//list.deleteAtPos(3);
		
		//list.insertAtPos(1, "Rahul");
		//list.insertAtPos(1, "Ritesh");
		System.out.println("Size:"+list.getSize());
		//System.out.println(list.getNode(2).getData());
		
		list.displayAll();
	}

}
