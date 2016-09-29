package com.markafoni.helpers;

public class GenericTuple<F,S,T> {
	
	private F first;
	private S second;
	private T third;
	
	public GenericTuple(F first, S second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public F getFirst() {return first;}
	public S getSecond() {return second;}
	public T getThird() {return third;}

	
	

}
