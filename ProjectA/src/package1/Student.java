package package1;

// {  } indicate body(boundary) of the class
// Class contains variable + method
public class Student 
{   // boundary(body) of the class

	int deepak;   // variable named deepak
	public void shruti() // () indicate this is a method
	{          
		System.out.println("Welcome to all of you");
	}
	public static void main(String[] args) 
	{
		Student abc=new Student();
		abc.deepak=222;  // calling the variable
		System.out.println("value of deepak "+abc.deepak);
		abc.shruti();  // calling the method
	}
	
	
}
