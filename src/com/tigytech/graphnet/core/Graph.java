package com.tigytech.graphnet.core;

import java.io.Serializable;

public interface Graph<V extends Entity, E> extends Serializable, Entity {
	
	public Iterable<E> getAllEdges(V source, V target);
	
	public E getEdge(Entity source, Entity target);
	
	public Iterable<V> getEntities();
	
	public boolean contains(Entity source, Entity target);
	
	public boolean containsEdge(E e);

	public boolean containsEntity(V v);
	
	public Iterable<E> getEdgeSet();
	
	public Iterable<E> getEdgesOf(V v);
	
	public Iterable<V> getEntitySet();
	
	public Entity getEdgeSource(E e);
	
	public Entity getEdgeTarget(E e);
	
	public double getEdgeWeight(E e);
	
	/**
	 * TODO: Separate mutability and immutability features.
	 */
	
	public E addEdge(V head, V tail);
	
	public E addEdge(V head, V tail, E e);
	
	public boolean addEntity(V v);
	
	public boolean removeAllEdges(Iterable<? extends E> e);

	public boolean removeAllEdges(Entity source, Entity target);
	
	public boolean removeAllEntities(Iterable<? extends Entity> e);
	
	public boolean removeEdge(Entity source, Entity target);
	
	public boolean removeEdge(E e);
	
	public boolean removeEntity(Entity e);
	
	/* */
	
}