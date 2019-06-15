package com.mind.basics;

public class StaticDemo {

	public static void main(String[] args) {
		
		//This not method overriding. It is method hiding
		
		Child c= new Child();
		c.display();
		
		Parent p=new Parent();
		p.display();
		
		Parent p1=new Child();
		p1.display();

		System.out.println(Parent.d);

	}

}
