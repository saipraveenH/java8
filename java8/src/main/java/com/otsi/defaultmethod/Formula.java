package com.otsi.defaultmethod;

public interface Formula {
	public abstract double calculate(int a);
	
	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
