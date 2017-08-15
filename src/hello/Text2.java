package hello;

public class Text2{
public static void main(String[] args){
	int[] arr={1,4,6,7,9};
	System.out.println(serch(arr,6));
 } 
static int serch(int[] arr,int target){
	int left = 0;
	int right = arr.length-1;
	while(left<right){
		int middle = (left+right)/2;		
		if(target==arr[middle]){		
			return target;			
		}else if(target>arr[middle]){
			left = middle;
		}else{
			right = middle;
		}
	}
	return -1;

}

}