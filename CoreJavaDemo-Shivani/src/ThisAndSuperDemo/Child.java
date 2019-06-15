package ThisAndSuperDemo;

public class Child extends Parent{

	//This and super cannot be used inside static context
	
	//int a=40;
	int b=20;


	public void show() {
		System.out.println("Inside method Child.show() ");
		
		//case1: direct call method and variable
		display();
		System.out.println(a);
		
		//case2: call method and variable using object of parent class
		Parent p=new Parent();
		p.display();
		System.out.println(p.a);
		
		//case4: call using super
		super.display();
		System.out.println(super.a);
		
		}
	
	public void thisExample()
	{
		int a=100;
		int b=200;

		System.out.println("Value of local a : "+a);
		System.out.println("Value of local b : "+b);

		System.out.println("Value of this.a : "+ this.a); //if not in this class, will check in super class
		System.out.println("Value of this.b : "+ this.b);
		System.out.println("Value of super.b : "+ super.b);
	}

}
