package com.otsi.interfaces;

public class DefaultMethodTest {
	public static void main(String[] args) {
		Formula formula = new FormulaImpl();
		System.out.println(formula.calculate(10000));
	}
}
