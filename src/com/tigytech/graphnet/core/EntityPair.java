package com.tigytech.graphnet.core;

import java.io.Serializable;

import com.tigytech.graphnet.util.Assertions;

public final class EntityPair<V> implements Serializable {

	private static final long serialVersionUID = 4189500958967808328L;
	
	private final V head;
	
	private final V tail;
	
	public EntityPair(V head, V tail) {
		this.head = Assertions.checkNotNull(head, "Cannot construct Entity with null head.");
		this.tail = Assertions.checkNotNull(tail, "Cannot construct Entity with null tail.");
	}

	public V getHead() {
		return head;
	}
	
	public V getTail() {
		return tail;
	}
	
}
