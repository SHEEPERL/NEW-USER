package ������;

import java.util.Scanner;
//ʮ������ת��ʮ����
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
	
	//��ʮ�������ַ���ת����ʮ������
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for(int i = 0;i<hex.length();i++) {
			char hexChar = hex.charAt(i);
			decimalValue  = decimalValue*16 + hexCharToDecimal(hexChar);
		}
		
		return decimalValue;
	}
	
	//����һ��ʮ�������ַ���ʮ������
	public static int hexCharToDecimal(char ch) {
		if(ch >= 'A' && ch <= 'F') {
			return 10+ch-'A';
		}
		else {//ch is '0','1'.....,or'9'
			return ch-'0';
		}
	}

}
