package com.java.data.structure.LinkedList;

public class LinkedList implements List {
	
	public Node start;
	public Node end;
	public int size;
	
	public LinkedList()
	{
		start=null;
		end=null;
		size=0;
	}
	//Check List Is Empty
	public boolean isEmpty()
	{
		if(start==null)
			return true;
		else
			return false;
	}
	
	@Override
	public void insertAtStart(Object data) {
		// TODO Auto-generated method stub
		
		Node node=new Node(data,null);
		size++;
		if(start==null)
		{
			start=node;
		    end=start;
		}
		else
		{
			node.setLink(start);
			start=node;
		}
		
		
		
	}
	@Override
	public void insertAtEnd(Object data) {
		
		Node node=new Node(data,null);
		size++;
		if(start==null)
		{
		start=node;
		end=start;
		}
		
		end.setLink(node);
		end=node;
		
	}
	@Override
	public void insertAtPos(int pos, Object data) throws PositionOutOfBoundException {
		
		boolean isInserted = false;
		//Checking Position Is Last and List is not Empty
		if(pos==(size))
		{
		insertAtEnd(data);
		isInserted=true;
		}
		//Checking List is Empty and Position is first
	    if(isEmpty() && pos==1)
	    {
	    	insertAtStart(data);
	    	isInserted=true;
	    }
			
		//Inserting the node in Middle
		if(!isInserted)
		{
			if(pos>size)
				throw new PositionOutOfBoundException("Inserting At InCorrect Position, Expected Position is "+(size+1));
			
		Node node=new Node(data,null);	
		Node ptr=start;
		for(int i=1;i<=size;i++)
		{
			if(i==pos)
			{
				Node temp=ptr.getLink();
				ptr.setLink(node);
				node.setLink(temp);
				break;
			}
			ptr=ptr.getLink();
		}
		size++;	
		}
	}
	@Override
	public void deleteFromStart() throws PositionOutOfBoundException {
		
		if(size==0)
			throw new PositionOutOfBoundException("Exception:There is no item in list");
		if(start==end)
		{
			start=null;
			end=null;
			size=0;
		}
		
		else
		{
			start=start.getLink();
			size--;
		}
	}
	@Override
	public void deleteAtEnd() throws PositionOutOfBoundException {
		if(size==0)
			throw new PositionOutOfBoundException("There is no item in list");
		if(start==end)
		{
			start=null;
			end=null;
			size=0;
		}
		
		else
		{
			Node ptr=start;
			for(int i=1;i<size;i++)
			{
				if(ptr.getLink().getLink()==null)
				{
			        Node node=ptr;
					ptr.getLink().setLink(null);
					ptr.setLink(null);
					size--;
					end=ptr;
					break;
			     
				}
				
				ptr=ptr.getLink();
			}
		}
		
	}
	@Override
	public void deleteAtPos(int pos) throws PositionOutOfBoundException {
	
		boolean isDeleted = false;
		//Checking Position Is Last and List is not Empty
		if(pos==(size))
		{
			deleteAtEnd();
			isDeleted=true;
		}
		//Checking List is Empty and Position is first
	    if(pos==1)
	    {
	    	deleteFromStart();
	    	isDeleted=true;
	    }
			
		//Deleting the node in Middle
		if(!isDeleted)
		{
			if(pos>size)
				throw new PositionOutOfBoundException("Deleting At InCorrect Position, Expected Position is "+(size+1));
		     
		Node ptr=start;
		for(int i=1;i<size;i++)
		{
			if(i==(pos-1))
			{
				Node temp=ptr.getLink().getLink();
				ptr.getLink().setLink(null);
				ptr.setLink(temp);
				
				break;
			}
			ptr=ptr.getLink();
		}
		size--;	
		}
		
	}
	@Override
	public Node getNode(int pos) throws PositionOutOfBoundException {
		
		if(pos>size)
			throw new PositionOutOfBoundException("Getting Node At InCorrect Position, Expected Position is "+(size+1));
	     
		Node ptr=start;
		Node node=null;
		for(int i=1;i<=size;i++)
		{
			if(i==pos)
			{
				node= ptr.getLink();
				break;
				
			}
			ptr=ptr.getLink();
		}
		
		return node;
	}
	@Override
	public void displayAll() {
		
		if(isEmpty())
			System.out.println("There is no list");
		Node ptr=start;
		for(int i=0;i<size;i++)
		{
			System.out.println(ptr.getData());
			ptr=ptr.getLink();
			
		}
		
	}
	
	//Getting Size of List
	public int getSize() {
		return size;
	}
	
}
