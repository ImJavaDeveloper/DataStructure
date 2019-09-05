package com.java.data.structure.LinkedList;

public interface List {
	
	public void insertAtStart(Object  data);
	public void insertAtEnd(Object  data);
	public void insertAtPos(int pos,Object data) throws PositionOutOfBoundException;
	
	public void deleteFromStart() throws PositionOutOfBoundException;
	public void deleteAtEnd() throws PositionOutOfBoundException;
	public void deleteAtPos(int pos) throws PositionOutOfBoundException;
	
	public Node getNode(int pos) throws PositionOutOfBoundException;
	public void displayAll();

}
