import java.util.Iterator;

/**
 *=============================================================================
 *
 * Author: Nikkster
 * 
 * Copyright (C) 2014, Nikkster
 */

public interface ISearchStrategy<T> {
	
	Iterator<INode<T>> search(T goal);
}
