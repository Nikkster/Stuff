import java.util.Stack;

/**
 * =============================================================================
 *
 * Author: Nikkster
 * 
 * Copyright (C) 2014, Nikkster
 * @param <T>
 */

public class DFSearch<T> implements ISearchStrategy<T> {
	private INode<T> start;

	public DFSearch(INode<T> start) {
		this.start = start;
	}

	public boolean search(T goal) {
		// The stack helps us to keep track of all unvisited nodes and as well as 
		// makes it possible to backtrack from a branch where no "solution" could be found.
		Stack<INode<T>> unvisitedNodes = new Stack<INode<T>>();
		unvisitedNodes.push(start);

		while (!unvisitedNodes.empty()) {
			INode<T> current = unvisitedNodes.pop();
			if (!current.isVisited()) {
				
				// Goal node?
				if (current.compareTo(goal) > 0)
					return true;
				
				// Mark as visited
				current.visit();

				for (INode<T> node : current.neighbours())
					unvisitedNodes.push(node);
			}
		}
		return false;
	}
}
