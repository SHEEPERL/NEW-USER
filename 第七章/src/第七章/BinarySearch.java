package 第七章;
//二分查找法
public class BinarySearch {
	
	//Use binary search to find key in the  list
	public static int binarySearch(int[] list,int key) {
		int low = 0;
		int high = list.length-1;
		
		while(high >= low) {
			int mid  = (high+low)/2;
			if(key < list[mid]) {
				high = mid -1;
			}
			else if(key == list[mid]) {
				return mid;
			}
			else {
				low = high +1;
			}
		}
		return -low-1;//Now high<low,key not found
	}
}
