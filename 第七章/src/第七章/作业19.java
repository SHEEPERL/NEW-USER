package 第七章;
import java.util.Scanner;
public class 作业19 {
	
	//数组是升序返回true，否则返回false
	public static boolean isSorted(int []list,int b) {
		for(int i=0;i<b;i++) {
			if(list[i]<list[i+1]) {//是升序
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter list: ");
		int[] List = new int[20];//声明数组
		int T = input.nextInt();//输入的T为数组中的元素个数
	
		for(int i = 0;i<T;i++) {//将输入的元素存储到数组List中
			List[i]  = input.nextInt();
		}

		//判断并输出
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








