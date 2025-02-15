package taks_three;
class example{
	static String name;
	int age;
	int marks;
	static String college;
	static
	{
	  name="ananthi"; //static variable initialization
	  college="SREC";
	  System.out.println("Static variable Initialization:");
	  System.out.println("Name is:"+name);
	  System.out.println("College is:"+college);
	  System.out.println();
	}
	{
		age=18; //instance variable initialization
		System.out.println("Instances variable Initialization:");
		System.out.println("Age is:"+age);
		System.out.println();
	}
	example()
	{
		System.out.println("Default Constructor:");
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("College is:"+college);
	}
	example(String name,int age,String college)
	{
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("College is:"+college);
	}
	example(example ex)
	{
		    this.name = ex.name;
	        this.age = ex.age;
	        this.college = ex.college;
			System.out.println("Name is:"+name+"\nAge is:"+age+"\nCollege is:"+college);
	}
	example(String name,int age,String college,int marks)
	{
		this.name=name;
		this.age=age;
		this.college=college;
		this.marks=marks;
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("College is:"+college);
		System.out.println("Total mark is:"+marks);
	}
	public void display()
	{
		System.out.println("Name is:"+name+"\nAge is:"+age+"\nCollege is:"+college);
	}
}
public class constructor_example {
	public static void main (String[] args)
	{
      example e1=new example();
	  System.out.println();
	  
	  System.out.println("Parameterized Constructor:");
      example e2=new example("Vishnu",17,"SREC");
	  System.out.println();
	  
	  System.out.println("Copy Constructor:");
      example e3=new example(e2);
	  System.out.println();
	  
      System.out.println("Constructor over loading:");
      example e4=new example("Bala",19,"KLU",99);
	  System.out.println();
      
}
}