package 第七章;
//线性查找
public class LinearSearch {

	//The method for finding a key in the list
	public static int listSearch(int[] list,int key) {
		for(int i  = 0;i<list.length;i++) {
			if(key == list[i]) {
				return i;
			}
		}
		return -1;

	}

}
