package com.tigytech.graphnet.graph.undirected;

import com.tigytech.graphnet.core.Entity;
import com.tigytech.graphnet.core.Graph;

public interface UndirectedGraph<V extends Entity, E> extends Graph<V, E> {
	
	public int degreeOf(V v);
	
}
