package 第六章;

import java.util.Scanner;
//十六进制转成十进制
public class Hex2Dec {
	
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter a string
		System.out.println("Enter a hex number: ");
		String hex = input.nextLine();
		
		System.out.println("The decimal value for the hex number "+hex+" is "+ hexToDecimal(hex.toUpperCase()));
		
		input.close();
	}
	
	//将十六进制字符串转换成十进制数
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for(int i = 0;i<hex.length();i++) {
			char hexChar = hex.charAt(i);
			decimalValue  = decimalValue*16 + hexCharToDecimal(hexChar);
		}
		
		return decimalValue;
	}
	
	//返回一个十六进制字符的十进制数
	public static int hexCharToDecimal(char ch) {
		if(ch >= 'A' && ch <= 'F') {
			return 10+ch-'A';
		}
		else {//ch is '0','1'.....,or'9'
			return ch-'0';
		}
	}

}
