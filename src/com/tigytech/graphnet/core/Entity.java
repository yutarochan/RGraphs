package com.tigytech.graphnet.core;

public interface Entity {
	
	public abstract int getID();
	
	public abstract Entity clone();
	
	public abstract int hashCode();
	
	public abstract boolean equals(Object e);
	
}
