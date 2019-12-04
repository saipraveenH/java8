package com.otsi.interfaces;

public interface Formula {
	public abstract double calculate(int a);

	default double sqrt(int a) {
		System.out.println("from interface");
		return Math.sqrt(a);
	}
}
