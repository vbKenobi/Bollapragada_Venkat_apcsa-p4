import java.util.Arrays;

public class test1
{
	private int testvalue;
	private String[] ray1;
	   public test1()
	   {
		   setValue(0);
		  
	   }
	   
	   public test1(int a)
	   {
		   setValue(a);
	   }
	   
	   public void setValue(int a)
	   {
		   testvalue = a;
	   }
	   
	   public int returnValue(String[] a)
	   {
		   ray1 = a;
		   return testvalue;
	   }
	   public String[] returnRay()
	   {
		   //System.out.println(Arrays.toString(ray1));
		   String s = "Hello";
		   String b = "llo";
		   s = s.substring(0, 4);
		   System.out.println(s);
		   return ray1;
		   
	   }
	   
	   public static void main(String args[])
	   {	
		   test1 test3 = new test1(6);
		   System.out.println(test3.returnValue(new String[] {"Hello", "This", "is", "a", "Test"}));
		   System.out.println(Arrays.toString(test3.returnRay()));
		}
}