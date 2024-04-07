package package1;

public class Solution1 {
	
	int a,b,c,d,e;
	
	public static void main(String[] args) 
	{
	Solution1 obj=new Solution1();
	obj.a=12;            // 1st call
	obj.b=44;            // 2nd 
	obj.c=444;          // 3rd
	obj.d=442;            // 4th
	obj.e=211;               // 5th
	System.out.println(obj.a);  // 6th
	System.out.println(obj.b);    // 7th
	System.out.println(obj.c);    // 8th
	System.out.println(obj.d);    // 9th
	System.out.println(obj.e);    // 10th
	}

}
