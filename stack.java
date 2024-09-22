package stack;
import java.util.Stack;
public class stack {
 public static void main (String[] args) {
	 Stack<String> himadry = new Stack <String>();
	 himadry.push("hellow");
	 himadry.push("jonny");
	 himadry.push("ckme");
	 System.out.println(himadry.pop());
	 System.out.println(himadry.pop());
	 System.out.println(himadry);
	 String lokkhi = himadry.pop();
	 System.out.println(lokkhi);
	 System.out.println(himadry);
	 
 }
}
