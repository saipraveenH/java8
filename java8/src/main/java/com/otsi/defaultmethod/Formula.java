package com.otsi.defaultmethod;

public interface Formula {
	default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
