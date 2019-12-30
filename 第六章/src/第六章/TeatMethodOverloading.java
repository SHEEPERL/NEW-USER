package µÚÁùÕÂ;

public class TeatMethodOverloading {

	public static void main(String[] args) {
		//Invoke the max method with int parameters
		System.out.println("The maxinum of 3 and 4 is "+max(3,4));
		
		//Invoke the max method with the double parameters
		System.out.println("The maxinum of 3.0 and 5.4 is "+max(3.0,5.4));

		//Invoke the max method with three double parameter
		System.out.println("The maxinum of3.0,5.4,and 10.14 is "+max(3.0,5.4,10.14));
		
	}
	
	//Return the max of two double values
	public static double max(double num1,double num2) {
		if(num1 >num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	//Return the max of two int values
	public static int max(int num1,int num2) {
		if(num1 >num2) {
			return num1;
		}else {
			return num2;
		}
	}
	//return the max f three double values
	public static double max(double num1,double num2,double num3) {
		return max(max(num1,num2),num3);
	}

}
