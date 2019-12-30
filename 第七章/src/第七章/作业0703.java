package 第七章;
import java.util.Scanner;
public class 作业0703 {
	public static void main(String[] args) {
		System.out.println("Enter the integers between 1 to 100.");
		int m = 1,i = 0,j = 0;//定义中间变量
		int Array[] = new int[10];//设置数组
		Scanner A = new Scanner(System.in);
		while ((Array[i] = A.nextInt()) != 0) {//将数字从键盘中读入数组
			i++;
		}
		for(i = 0;i<Array.length;i++) {//给数组的数字从小到大排序
			for(j = i+1;j<Array.length;j++) {
				if(Array[i]>Array[j]) {//如果Array[i]大于Array[j],则交换顺序
					int mid;
					mid = Array[i];
					Array[i] = Array[j];
					Array[j] = mid;
				}
			}
		}
		for(i = 0;i < Array.length-1;i++){//用双重循环比较两个数是否相等
			for(j = i+1;j < Array.length;j++) {
				if(Array[i] == Array[j]) {
					m++;//如果两个数相等，则出现次数(m)+1
				}
			}
			if(m >= 2) {//分情况输出
				System.out.println(Array[i]+" occurs "+m+" times");
			}else {
				System.out.println(Array[i]+" occurs "+m+" time");
			}
			m = 1;
		}
		A.close();
	}
}