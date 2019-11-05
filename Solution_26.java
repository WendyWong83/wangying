package leecode;

import java.util.Arrays;
import java.util.Random;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @author WANGYING
 *
 */
public class Solution_26 {

	
	public static void main(String[] args) {
		int[] arr = newArr(15);
		System.out.println("原数组："+Arrays.toString(arr));
		sort(arr);
		System.out.println("排序后数组：" +Arrays.toString(arr));
		System.out.println("去重后数组新长度："+distinct(arr));
		
       
	}
    
    /**
     * 数组删去重复元素后的长度
     * @param arr
     * @return
     */
    public static int distinct(int[] arr) {
    	int num = 1;
    	if(arr.length <= 1) {
    		return arr.length;
    	}else  {
    		int temp = arr[0];
    		for (int i = 0; i < arr.length; i++) {
    			if(arr[i] == temp) {
    				continue;
    			} else {
    				temp = arr[i];
    				num++;
    			}
    		}
    		return num;
    	}
    }
    /**
     * 随机生成数组
     * @param length
     * @return
     */
    public static int[] newArr(int length){
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(8);
		}
    	return arr;
    }
    
    /**
     * 针对数组进行排序
     * @param arr
     */
    public static void sort(int[] arr) {
    	for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				int temp = arr[j];
				if(temp < arr[j-1]) {
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
    }
}
