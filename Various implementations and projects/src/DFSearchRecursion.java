import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *=============================================================================
 *
 * Author: Nikkster
 * 
 * Copyright (C) 2014, Nikkster
 */

public class DFSearchRecursion<T> implements ISearchStrategy<T> {
	private INode<T> start;
	private Set<INode<T>> visitedNodes = new HashSet<INode<T>>();

	public DFSearchRecursion(INode<T> start) {
		this.start = start;
	}
	
	public Iterator<INode<T>> search(T goal) {
		return search(goal, start);
	}
	
	private Iterator<INode<T>> search(T goal, INode<T> node) {
		// Base case is trivial: The first node is the goal.
		if (node.compareTo(goal) > 0) 
			return visitedNodes.iterator();
		
		visitedNodes.add(node);
		for (INode<T> adjNode : node.neighbours()) {
			if (!visitedNodes.contains(adjNode)) {
				if ( (search(goal, adjNode) != null) )
					return visitedNodes.iterator();
			}
		}
		// There was no solution in the graph.
		return null;
	}

}
