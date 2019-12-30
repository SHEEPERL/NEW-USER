package 第七章;
import java.util.Scanner;
public class 作业0731 {

	//将某个数插入数组中的某个位置
	public static void insert(int []list,int n,int m) {//将m插入到list[n]后
		int i;
		for(i = list.length;i>n;i--) {//自list[n]后所有元素往后挪一位
			list[i+1] = list[i]; 
		}
		list[n+1] = m;//将m插入到数组中
	}
	
	
	//将两个有序数组合并成为一个有序数组
	public static void merge(int[] list1,int[] list2) {
		int i,j;
		if(list1.length>list2.length) {//元素个数多的数组插入元素个数少的数组
			for(i = 0;i<list1.length;i++) {//将list1插入到list2中
				for(j = 0;j<list2.length;j++) {
					if(list1[i] >= list2[j] && list1[i] <= list2[j+1] ) {//插入条件
						insert(list2,j,list1[i]);
					}
					else if(list1[i] >= list2[list2.length]) {
						list2[list2.length + 1] = list1[i];
					}
				}
			}
		}
		else {//将list2插入到list1中
			for(i = 0;i<list2.length;i++) {
				for(j = 0;j<list1.length;j++) {
					if(list2[i] >= list1[j] && list2[i] <= list1[j+1] ) {//插入条件
						insert(list1,j,list2[i]);
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] List1 = new int[40];//需要将List2的数组元素插入到List1，故需要申请更大的空间
		int[] List2 = new int[40];
		int i,j;
		
		System.out.print("Enter list1: ");
		int a = input.nextInt();//a为数组List1将要读入的元素个数
		for(i = 0;i<a;i++) {//从键盘读入List1
			List1[i] = input.nextInt();
		}

		System.out.print("Enter list2: ");
		int b = input.nextInt();//b为数组List2将要读入的元素个数
		for(i = 0;i<b;i++) {//从键盘读入List2
			List1[i] = input.nextInt();
		}

		merge(List1,List2);//合并两有序列表
		
		System.out.print("The merged list is " );//输出最后合并好的列表
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
