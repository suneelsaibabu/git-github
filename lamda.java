package assignment;


public class lamda implements intref {
	public static void main(String[] args) {
		intref l=new lamda();
		l.fun("suneel");
	}
	
	@Override
	public void fun(String s) {
		// TODO Auto-generated method stub
		s="suneel";
		System.out.println(s.length());
	
}}
@FunctionalInterface
interface intref
{
	public void fun(String s);
}
@FunctionalInterface
interface mts extends intref
{
	public void fun(String s);
	default void sun() {
		System.out.println("hello suneel sai babu where are you from");
	}
	public static void nnn() {
		System.out.println("many many happy returns of the day");
	}
}
	


