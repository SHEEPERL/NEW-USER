package ������;
import java.util.Scanner;
public class ��ҵ0703 {
	public static void main(String[] args) {
		System.out.println("Enter the integers between 1 to 100.");
		int m = 1,i = 0,j = 0;//�����м����
		int Array[] = new int[10];//��������
		Scanner A = new Scanner(System.in);
		while ((Array[i] = A.nextInt()) != 0) {//�����ִӼ����ж�������
			i++;
		}
		for(i = 0;i<Array.length;i++) {//����������ִ�С��������
			for(j = i+1;j<Array.length;j++) {
				if(Array[i]>Array[j]) {//���Array[i]����Array[j],�򽻻�˳��
					int mid;
					mid = Array[i];
					Array[i] = Array[j];
					Array[j] = mid;
				}
			}
		}
		for(i = 0;i < Array.length-1;i++){//��˫��ѭ���Ƚ��������Ƿ����
			for(j = i+1;j < Array.length;j++) {
				if(Array[i] == Array[j]) {
					m++;//�����������ȣ�����ִ���(m)+1
				}
			}
			if(m >= 2) {//��������
				System.out.println(Array[i]+" occurs "+m+" times");
			}else {
				System.out.println(Array[i]+" occurs "+m+" time");
			}
			m = 1;
		}
		A.close();
	}
}