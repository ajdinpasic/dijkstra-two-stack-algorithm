package dijkstra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		DijkstraStack operands=new DijkstraStack();
		DijkstraStack operators=new DijkstraStack();
		Scanner scanner=new Scanner(System.in);
		String[] user_input=scanner.nextLine().split(" ");
		scanner.close();
		String temp;
		for (int i=0;i<user_input.length;i++) {
			
			 temp=user_input[i];
			
			if(isInt(temp)) {
				operands.push(temp);
			}
			else if(temp.equals("(")) {
			
			}
			else if(temp.equals(")")) {
				int value1=Integer.parseInt(operands.pop());
				int value2=Integer.parseInt(operands.pop());
				String operator=operators.pop();
				String result=perform(value1,value2,operator);
				operands.push(result);
				
			}
			else {
				operators.push(temp);
			}
			
			

} 		
		
		System.out.println("The result is: "+Integer.parseInt(operands.pop()));
	}
	public static boolean isInt(String item) {
		@SuppressWarnings("unused")
		int myNumber;
		try {
			myNumber=Integer.parseInt(item);
			return true;
		} catch (Exception e) {
			
		}
		return false;
		
	}
	
	
	public static String perform(int value1,int value2,String operator) {
		switch (operator) {
		
		
		case "+": {
			value2+=value1;
			break;
		}
		case "-": {
			value2-=value1;
			break;
		}
		case "*": {
			value2*=value1;
			break;
		}
		case "/": {
			value2/=value1;
			break;
		}
		
		
	}
		String result=String.valueOf(value2);
		return result;
		


}
}