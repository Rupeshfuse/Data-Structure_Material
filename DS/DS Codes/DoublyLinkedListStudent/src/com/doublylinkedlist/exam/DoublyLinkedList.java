package com.doublylinkedlist.exam;
import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> , Iterator<T> , ReverseIterable<T>, ReverseIterator<T> {
	private DoublyNode<T> iteratorPointer;
	private DoublyNode<T> reverseIteratorPointer;
	private int size;
	private DoublyNode<T> root;


	@Override
	public boolean hasPreviuos() {
		if(reverseIteratorPointer==null) {
			return false;
		}
		if(reverseIteratorPointer!=null) {
			return true;
		}
		return false;
	}

	@Override
	public T previous() {
		T data=reverseIteratorPointer.getData();
		reverseIteratorPointer=reverseIteratorPointer.getPrevious();
		return data;
	}

	@Override
	public ReverseIterator<T> reverseIterator() {
		resetIteratorPointers();
		return this;
	}

	@Override
	public boolean hasNext() {
		if(iteratorPointer==null) {
			return false;
		}
		if(iteratorPointer!=null) {
			return true;
		}
		return false;
	}

	@Override
	public T next() {
		T data=iteratorPointer.getData();
		iteratorPointer=iteratorPointer.getNext();
		return data;
	}

	@Override
	public Iterator<T> iterator() {
		resetIteratorPointers();
		return this;
	}
	private void resetIteratorPointers() {
		iteratorPointer=this.root;
		reverseIteratorPointer=getLastNode(this.root);
	}
	
	public void reverse(boolean recursive) {
    	if(this.root==null) {
    		return;
    	}
    	if(!recursive) {
    		DoublyNode<T> current=this.root;
        	DoublyNode<T> next=null;
        	DoublyNode<T> previous=null;
        	while(current!=null) {
        		next=current.getNext();
        		previous=current.getPrevious();
        		current.setNext(previous);
        		current.setPrevious(next);
        		current=current.getPrevious();
        	}
        	this.root=previous.getPrevious();
    	}
    	else {
    		this.root=reverseByRecursion(this.root);
    	}
    	resetIteratorPointers();
	}
    
    private DoublyNode<T> reverseByRecursion(DoublyNode<T> currentNode) {
    	DoublyNode<T> current=currentNode;
    	DoublyNode<T> next=null;
    	DoublyNode<T> previous=null;
    	if(current!=null) {
    		next=current.getNext();
    		previous=current.getPrevious();
    		current.setNext(previous);
    		current.setPrevious(next);
    		current=current.getPrevious();
    		if(current!=null) {
    		return reverseByRecursion(current);
    		}
    		else {
    			return previous.getPrevious();
    		}
    	}
    	return null;
	}
    
	/**
	 * Delete the data from first occurrence
	 * @param data
	 */
	public void delete(T data) {
		if(data==null) {
			return;
		}
		boolean dataFound=false;
		DoublyNode<T> currentNode=this.root;
		while(!dataFound) {
			if(currentNode.getData().equals(data)) {
				DoublyNode<T> previousNode=currentNode.getPrevious();
				DoublyNode<T> nextNode=currentNode.getNext();
				if(previousNode !=null) {
					previousNode.setNext(nextNode);
				}
				else {
					this.root=nextNode;
				}
				if(nextNode !=null) {
					nextNode.setPrevious(previousNode);
				}
				dataFound=true;
			}
			else {
				currentNode=currentNode.getNext();
			}
		}
		size--;
		resetIteratorPointers();
	}
	
	public void deleteByIndex( int index) {
    	if(this.root==null) {
    		return;
    	}
		if(index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException("Index not available.");
		}
		// If index is 0 , means needs to remove first node
		if(index == 0) {
			DoublyNode<T> secondNode = this.root.getNext();
			if(secondNode!=null) {
			secondNode.setPrevious(null);
			}
			this.root=secondNode;
		}
		// If index is last , means needs to remove last node
		else if(index == this.size -1) {
			DoublyNode<T> lastNode = getLastNode(this.root);
			DoublyNode<T> secondLastNode = lastNode.getPrevious();
			secondLastNode.setNext(null);
		}
		// Remove any index data
		else {
			DoublyNode<T> nodeToBeDelete = getNode(index);
			DoublyNode<T> next = nodeToBeDelete.getNext();
			DoublyNode<T> previous = nodeToBeDelete.getPrevious();
			next.setPrevious(previous);
			previous.setNext(next);
		}
		size--;
		resetIteratorPointers();
	}
	public void add(T data) {
		if (data == null) {
			return;
		}

		if (root == null) {
			root = new DoublyNode<T>(data);
		} else {
			DoublyNode<T> newNode = new DoublyNode<T>(data);
			DoublyNode<T> lastNode = getLastNode(root);
			lastNode.setNext(newNode);
			newNode.setPrevious(lastNode);
		}
		size++;
		resetIteratorPointers();
	}
	public void addAtFirst(T data) {
		if (data == null) {
			return;
		}
		DoublyNode<T> newNode = new DoublyNode<T>(data);
		if (this.root != null) {
			this.root.setPrevious(newNode);
			newNode.setNext(this.root);
			this.root = newNode;
		} else {
			this.root = newNode;
		}
		size++;
		resetIteratorPointers();
	}
	public void add(T data, int index) throws IndexOutOfBoundsException {
		if (data == null) {
			return;
		}
		if (index == 0) {
			addAtFirst(data);
			return;
		}
		if (index == this.size) {
			add(data);
		} else if (index < this.size) {
			DoublyNode<T> newNode = new DoublyNode<T>(data);
			DoublyNode<T> rightNode = getNode(index);
			DoublyNode<T> leftNode = rightNode.getPrevious();
			leftNode.setNext(newNode);
			newNode.setPrevious(leftNode);
			newNode.setNext(rightNode);
			rightNode.setPrevious(newNode);
			size++;
		} else {
			throw new IndexOutOfBoundsException("Index not available.");
		}
		resetIteratorPointers();
	}
	private DoublyNode<T> getNode(int index) {

		if (index < 0 || index > this.size - 1) {
			throw new IndexOutOfBoundsException("Index not available.");
		}
		// If index=0 , return head
		if (index == 0) {
			return this.root;
		}
		// If index= size, return last node
		if (index == this.size - 1) {
			return getLastNode(this.root);
		}
		int pointer = 0;
		DoublyNode<T> pointerNode = this.root;
		while (pointer <= index) {
			if (pointer == index) {
				return pointerNode;
			} else {
				pointerNode = next(pointerNode);
				pointer++;
			}
		}
		return null;
	}
	private DoublyNode<T> getLastNode(DoublyNode<T> node) {
	      if(node !=null) {
			DoublyNode<T> lastNode = node;
			if (lastNode.getNext() != null) {
				return getLastNode(lastNode.getNext());
			} else {
				return lastNode;
			}
	      }
	      return null;
		}

	private DoublyNode<T> next(DoublyNode<T> node) {
		if (node.getNext() != null) {
			return node.getNext();
		} else {
			return null;
		}
	}

	public int size() {
		return this.size;
	}

	public void clear() {
		this.root = null;
		this.size = 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((root == null) ? 0 : root.hashCode());
		result = prime * result + size;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof DoublyLinkedList))
			return false;
		DoublyLinkedList other = (DoublyLinkedList) obj;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	@Override
	public String toString() {
		String represent = "[";
		DoublyNode<T> nextNode = this.root;
		while (nextNode != null) {
			represent = represent + nextNode.toString();
			nextNode = next(nextNode);
			if (nextNode != null) {
				represent = represent + ",";
			}
		}
		represent = represent + "]";
		return represent;
	}

}
