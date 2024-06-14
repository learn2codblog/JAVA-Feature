/**
 * 
 */
package com.java.handson.features.JavaFeatures.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author pradeepk
 *
 */
@Service
public class ArrayListFeatures {
	
	/*
	 * This is service class and will be used for show casing different features 
	 * and methods of ArrayList
	 * 
	 * Using @Service makes it clear that the class provides business logic, 
	 * enhancing code readability and maintainability.
	 * 
	 * 
	 * 
	 * The @Service annotation in 
	 * Spring is used to define service layer components that encapsulate business logic. 
	 * It enhances code organization, supports dependency injection, and promotes a clean separation of concerns. 
	 * By using @Service, developers can create maintainable and testable applications with a clear architectural structure.
	 * 
	 * 
	 */
	
	private List<Integer> integerList = new ArrayList<Integer>();
	
	private List<String> stringList = new ArrayList<String>();
	
	public ArrayListFeatures() {
		addIntegerElement();
		addStringElement();
	}
	
	public ArrayListFeatures(List<String> strigList, List<Integer> integerList) {
		this.integerList=integerList;
		this.stringList=strigList;
	}
	
	public void printElementFromList() {
		integerList.stream().forEach(System.out::print);
		stringList.stream().forEach(System.out::print);
	}
	
	public List<Integer> addIntegerElement() {
		
		integerList.add(5);
		integerList.add(10);
		integerList.add(100);
		
		return integerList;
		
		
	}
	
	public List<String> addStringElement() {
		stringList.add("Hello");
		stringList.add(" world");
		stringList.add("I am here ");
		stringList.add(" for sweet ");
		stringList.add(" potato ");
		stringList.add(" and learning");
		stringList.add(" Java Programming");
		stringList.add(" world");
		return stringList;
	}

	public List<String> printElentWithS(){
		return stringList.stream().filter(s->s.startsWith("s")).toList();
	}
}
