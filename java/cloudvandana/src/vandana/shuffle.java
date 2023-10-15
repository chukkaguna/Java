package vandana;
import java.util.Random;
public class shuffle {
     public static int[] shuffle(int[] arr) {
    	Random r=new Random();
    	 for(int i=0;i<=arr.length-1;i++) {
    		 int j=r.nextInt(i+1);
    			 int temp=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=temp;
    	 }
    	 return arr;
     }
     public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] res=shuffle(arr);
		for(int k:res) {
			System.out.print(k+" ");
		}
	}
}
