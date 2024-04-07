package package1;

public class Deepak
{
  public Deepak() 
  {
	System.out.println("Default constructor");
  }
  public Deepak(int a) 
  {
	this(44,555); // control will go to two parameterized
	System.out.println("one parameterized constructor");
  }
  
  public Deepak(int a,int b) 
  {
	  this();  // control will go to default constructor
	System.out.println("two parameterized constructor");
  }
  public static void main(String[] args) 
  {
	Deepak obj=new Deepak(23); //control will go to one parameter
  }
}
