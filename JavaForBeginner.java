package javaForBeginner;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class JavaForBeginner {

  /**
 * @param args
 */
public static void main(String[] args) {
    // Variables:
    // We use variables to temporarily store data in computer’s memory. In Java, the
    // type
    // of a variable should be specified at the time of declaration.
    // In Java, we have two categories of types:
    // • Primitives: for storing simple values like numbers, strings and booleans.
    // Primitive Types: byte - short - int - long - float - double - char - boolean

    // • Reference Types: for storing complex objects like email messages.

    // Declaring Variables:
	  
//    byte age = 30;
//    long viewsCount = 3_123_456L;
//    float price = 10.99F;
//    char letter = 'A';
//    boolean isEligible = true;

    // In Java, we terminate statements with a semicolon.
    // We enclose characters with single quotes and strings (series of characters)
    // with double quotes.
    // The default integer type in Java is int. To represent a long value, we should
    // add L to it as a postfix.
    // The default floating-point type in Java is double. To represent a float, we
    // should append F to it as a postfix.

//    System.out.println("hello");
//    System.out.println(age);
//    System.out.println(viewsCount);
//    System.out.println(price);
//    System.out.println(letter);
//    System.out.println(isEligible);

    // Reference Types
    // In Java we have 8 primitive types. All the other types are reference types.
    // These
    // types don’t store the actual objects in memory. They store the reference (or
    // the
    // address of) an object in memory.
    // To use reference types, we need to allocate memory using the new operator.
    // The
    // memory gets automatically released when no longer used.

//    Date now = new Date();
//    System.out.println(now);
    
//    Strings
//    Strings are reference types but we don’t need to use the new operator to allocate
//    memory to them. We can declare string variables like the primitives since we use
//    them a lot.
    
//    String name = "Mike";
//    System.out.println(name);
    
   //Useful String Methods
    //The String class in Java provides a number of useful methods:
    
//    System.out.println(name.startsWith("i"));
//    System.out.println(name.endsWith("e"));
//    System.out.println(name.length());
//    System.out.println(name.indexOf("i"));
//    System.out.println(name.replace("i", "y"));
//    System.out.println(name.toUpperCase());
//    System.out.println(name.toLowerCase());
    
    
//    Strings are immutable, which means once we initialize them, their value cannot be
//    changed. All methods that modify a string (like toUpperCase) return a new string
//    object. The original string remains unaffected.
    
    
//    Escape Sequences
//    If you need to use a backslash or a double quotation mark in a string, you need to
//    prefix it with a backslash. This is called escaping.
//    Common escape sequences:
	
//    System.out.println("\\hello\\");
//    System.out.println("\"hello\"");
//    System.out.println("hello\nhello 2");
	
//	Arrays
//	We use arrays to store a list of objects. We can store any type of object in an array
//	(primitive or reference type). All items (also called elements) in an array have the
//	same type.
	
	// Creating and and initializing an array of 3 elements
	
//	int[] numbers = new int[3];
//	numbers[0] = 10;
//	numbers[1] = 20;
//	numbers[2] = 30;
//	// Shortcut
//	int[] numbers2 = { 10, 20, 30 };
//	System.out.println(numbers2);
//	System.out.println(Arrays.toString(numbers2));
//	
//	List<Integer> gArray = new ArrayList <>();
//	List<Integer> xArray = Arrays.asList(5,3,6,8,3,3);
//	
//	System.out.println(Arrays.toString(xArray.toArray())); 
//	
//	gArray.add(3);
//	gArray.add(6);
//	gArray.add(0,5);
//	gArray.set(0, gArray.get(0) * 2);
//	
//	System.out.println(gArray.get(0));
//	System.out.println(gArray.remove(0));
//	System.out.println(gArray.indexOf(6));
//	System.out.println(gArray.contains(2));
//	System.out.println(gArray.isEmpty());
//	System.out.println(gArray.size());
//	Collections.sort(xArray);
//	System.out.println(Arrays.toString(xArray.toArray()));
	
	
	
	
//	Constants
//	Constants (also called final variables) have a fixed value. Once we set them, we
//	cannot change them.
	
//	final float INTEREST_RATE = 0.04f;
//	System.out.println(Arrays.toString(xArray.toArray()));
	
//	By convention, we use CAPITAL LETTERS to name constants. Multiple words can
//	be separated using an underscore. 

	
//	If Statements
//	Here is the basic structure of an if statement. If you want to execute multiple
//	statements, you need to wrap them in curly braces.
	
//	if (1==1)
//		System.out.println("1");
//	else if (1 != 2)
//		System.out.println("2");
//	else if (1 > 0)
//		System.out.println("3");
//	else
//		System.out.println("last");
	
//	The Ternary Operator
	
//	int income = 100;
//	String className = (income > 100_000) ? "First" : "Economy";
//	System.out.println(className);
	

//	Switch Statements
//	We use switch statements to execute different parts of the code depending on the
//	value of a variable.
	
//	int x = 1;
//	switch (x) {
//	 case 1:
//		 System.out.println("1");
//	 break;
//	 case 2:
//		 System.out.println("2");
//	 break;
//	 default:
//		 System.out.println("3");
//	}
	
//	After each case clause, we use the break statements to jump out of the switch
//	block. 
	
	
//	For Loops
//	For loops are useful when we know ahead of time how many times we want to
//	repeat something. We declare a loop variable (or loop counter) and in each
//	iteration we increment it until we reach the number of times we want to execute
//	some code.
	
//	for (int i = 0; i < 5; i++)
//		System.out.println(i);
	
	
	
	
	
	
//	While Loops
//	While loops are useful when we don’t know ahead of time how many times we want
//	to repeat something. This may be dependent on the values at run-time (eg what the
//	user enters).
	
//	int i = 0;
//	while (i < 5) {
//		System.out.println(i);
//		i++;
		
		
		
//		Do..While Loops
//		Do..While loops are very similar to while loops but they executed at least once. In
//		contrast, a while loop may never get executed if the condition is initially false.
	
//	int i = 0;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i < 5);
	
	
//	For-each Loops
//	For-each loops are useful for iterating over an array or a collection.
	
	int[] numbers = {1, 2, 3, 4};
	for (int number : numbers)
		System.out.println(number);
	
  }

}