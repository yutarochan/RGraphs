package com.tigytech.graphnet.core;

public interface MutableGraph<V extends Entity, E> extends Graph<V, E> {
	
	public E addEdge(V head, V tail);
	
	public E addEdge(V head, V tail, E e);
	
	public boolean addEntity(V v);
	
	public boolean removeAllEdges(Iterable<? extends E> e);

	public boolean removeAllEdges(Entity source, Entity target);
	
	public boolean removeAllEntities(Iterable<? extends Entity> e);
	
	public boolean removeEdge(Entity source, Entity target);
	
	public boolean removeEdge(E e);
	
	public boolean removeEntity(Entity e);
	
}
