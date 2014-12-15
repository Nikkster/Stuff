import java.util.List;

/**
 *=============================================================================
 *
 * Author: Nikkster
 * 
 * Copyright (C) 2014, Nikkster
 */

public interface INode<T> extends Comparable<T> {
	
	void connect(INode<T> node);
	List<INode<T>> neighbours();

}
