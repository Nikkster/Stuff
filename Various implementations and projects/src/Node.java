import java.util.ArrayList;
import java.util.List;

/**
 *=============================================================================
 *
 * Author: Nikkster
 * 
 * Node.java
 * 
 * 
 * Copyright (C) 2014, Nikkster
 */

public class Node<T> implements INode<T> {
	
	private final T state;
	private List<INode<T>> adjacentList = new ArrayList<>();
	
	public Node(T state) {
		this.state = state;
	}
	public T getState() {
		return state;
	}
	
	public void connect(INode<T> node) {
		this.adjacentList.add(node);
	}
	
	public List<INode<T>> neighbours() {
		return adjacentList;
	}
	
	public int compareTo(T stateToCompare) {
		return (state.equals(stateToCompare) != false) ? 1 : -1;
	}
	
	public String toString() {
		return state.toString();
	}
}
