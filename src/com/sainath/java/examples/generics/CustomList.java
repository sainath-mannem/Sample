package com.sainath.java.examples.generics;

import java.util.ArrayList;

public class CustomList<E extends Number> extends ArrayList<E>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public static void main(String[] args) {
		CustomList<Float> list = new CustomList<>();
		list.add(1f);
		
	}

}
