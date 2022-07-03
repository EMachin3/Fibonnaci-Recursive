import java.util.*;
public class fibonacciRecursive {	
	public static ArrayList<Integer> fibonacci(int a){
		ArrayList<Integer> firstAndSecond = new ArrayList<Integer>();
		firstAndSecond.add(1);
		firstAndSecond.add(1);
		int b=2;
		int number1 = 1;
		int number2 = 1;
		int dummy = 0;
	while (a>b){
		dummy = number2;
		number2 = number1 + number2;
		firstAndSecond.add(number2);
		number1 = dummy;
		b++;
	}
		return(firstAndSecond);
	}
	public static void recursive(int n1th, int n2th) {
		if (n2th>=1){
			System.out.println(n2th);
			recursive(n2th, (n1th - n2th));
		}
	}
	public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);
	int fibLength = Integer.parseInt(myObj.nextLine());
	ArrayList<Integer> sequence = fibonacci(fibLength);
	//System.out.println(sequence);
	int n1 = sequence.get(fibLength-1);
	int n2 = sequence.get(fibLength-2);
	System.out.println(n1);
	recursive(n1, n2);
	}
}