package ������;
import java.util.Scanner;
public class ��ҵ0731 {

	//��ĳ�������������е�ĳ��λ��
	public static void insert(int []list,int n,int m) {//��m���뵽list[n]��
		int i;
		for(i = list.length;i>n;i--) {//��list[n]������Ԫ������Ųһλ
			list[i+1] = list[i]; 
		}
		list[n+1] = m;//��m���뵽������
	}
	
	
	//��������������ϲ���Ϊһ����������
	public static void merge(int[] list1,int[] list2) {
		int i,j;
		if(list1.length>list2.length) {//Ԫ�ظ�������������Ԫ�ظ����ٵ�����
			for(i = 0;i<list1.length;i++) {//��list1���뵽list2��
				for(j = 0;j<list2.length;j++) {
					if(list1[i] >= list2[j] && list1[i] <= list2[j+1] ) {//��������
						insert(list2,j,list1[i]);
					}
					else if(list1[i] >= list2[list2.length]) {
						list2[list2.length + 1] = list1[i];
					}
				}
			}
		}
		else {//��list2���뵽list1��
			for(i = 0;i<list2.length;i++) {
				for(j = 0;j<list1.length;j++) {
					if(list2[i] >= list1[j] && list2[i] <= list1[j+1] ) {//��������
						insert(list1,j,list2[i]);
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] List1 = new int[40];//��Ҫ��List2������Ԫ�ز��뵽List1������Ҫ�������Ŀռ�
		int[] List2 = new int[40];
		int i,j;
		
		System.out.print("Enter list1: ");
		int a = input.nextInt();//aΪ����List1��Ҫ�����Ԫ�ظ���
		for(i = 0;i<a;i++) {//�Ӽ��̶���List1
			List1[i] = input.nextInt();
		}

		System.out.print("Enter list2: ");
		int b = input.nextInt();//bΪ����List2��Ҫ�����Ԫ�ظ���
		for(i = 0;i<b;i++) {//�Ӽ��̶���List2
			List1[i] = input.nextInt();
		}

		merge(List1,List2);//�ϲ��������б�
		
		System.out.print("The merged list is " );//������ϲ��õ��б�
		if(List1.length>List2.length) {
			for( j = 0;j<List1.length;j++) {
				System.out.print(List1[j]);
			}
		}
		else {
			for( j = 0;j< List2.length;j++) {
				System.out.print(List2[j]);
			}
		}
		
		input.close();
	}

}
