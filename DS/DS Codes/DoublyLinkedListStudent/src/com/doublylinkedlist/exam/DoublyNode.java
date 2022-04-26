package com.doublylinkedlist.exam;

public class DoublyNode<T> {
	
	 private T data ;
		
		private DoublyNode<T> next;
		
		private DoublyNode<T> previous;

		public DoublyNode(T data) {
			this.data = data;
		}
		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public DoublyNode<T> getNext() {
			return next;
		}

		public void setNext(DoublyNode<T> next) {
			this.next = next;
		}

		public DoublyNode<T> getPrevious() {
			return previous;
		}

		public void setPrevious(DoublyNode<T> previous) {
			this.previous = previous;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((data == null) ? 0 : data.hashCode());
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			result = prime * result + ((previous == null) ? 0 : previous.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof DoublyNode))
				return false;
			DoublyNode other = (DoublyNode) obj;
			if (data == null) {
				if (other.data != null)
					return false;
			} else if (!data.equals(other.data))
				return false;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			if (previous == null) {
				if (other.previous != null)
					return false;
			} else if (!previous.equals(other.previous))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "DoublyNode [data=" + data + "]";
		}
	
}
