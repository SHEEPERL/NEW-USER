package ������;
import java.util.Scanner;
public class ��ҵ19 {
	
	//���������򷵻�true�����򷵻�false
	public static boolean isSorted(int []list,int b) {
		for(int i=0;i<b;i++) {
			if(list[i]<list[i+1]) {//������
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter list: ");
		int[] List = new int[20];//��������
		int T = input.nextInt();//�����TΪ�����е�Ԫ�ظ���
	
		for(int i = 0;i<T;i++) {//�������Ԫ�ش洢������List��
			List[i]  = input.nextInt();
		}

		//�жϲ����
		boolean a = isSorted(List,T);
		if(a == true) {
			System.out.println("The list is already sorted");
		}
		else {
			System.out.println("The list is not sorted");
		}
		
		input.close();
	}
}








