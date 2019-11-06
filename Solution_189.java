package leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * 旋转数组：给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法
 *
 * @author WANGYING
 *
 */
public class Solution_189 {

	public static void main(String[] args) {
		int[] arr = newArr(10);
		System.out.println("原数组："+Arrays.toString(arr));
		rotate(arr,4);
		System.out.println("翻转后新数组："+Arrays.toString(arr));

	}

	/**
	 * 将原数组分成两部分，分割点为翻转后在数组中最后一位在原数组的位置
	 * @param nums
	 * @param k
	 */
	public static void rotate(int[] arr, int k) {
		if (arr == null || arr.length <= 1 || k <= 0) {
			return;
		}
		int len = arr.length;
		k %= len;
		reverse(arr, 0, len - k - 1);//调换前半部分
		reverse(arr, len - k, arr.length - 1);//调换后半部分
		reverse(arr, 0, arr.length - 1);//整个调换

	}

	/**
	 * 翻转制定范围内的数组
	 * @param nums
	 * @param start
	 * @param end
	 */
	public static void reverse(int[] arr, int start, int end) {
		int time = (end - start + 1) / 2;//调换次数
		for (int i = 0; i < time; i++) {//一头一尾相互调换
			int temp = arr[end - i];
			arr[end - i] = arr[start + i];
			arr[start + i] = temp;
//			System.out.println(Arrays.toString(arr));
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
			arr[i] = random.nextInt(100);
		}
    	return arr;
    }
	
}
