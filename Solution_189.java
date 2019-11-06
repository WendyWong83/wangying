package leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * ��ת���飺����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����
 * �������������Ľ�����������������ֲ�ͬ�ķ������Խ��������⡣
 * Ҫ��ʹ�ÿռ临�Ӷ�Ϊ O(1) �� ԭ�� �㷨
 *
 * @author WANGYING
 *
 */
public class Solution_189 {

	public static void main(String[] args) {
		int[] arr = newArr(10);
		System.out.println("ԭ���飺"+Arrays.toString(arr));
		rotate(arr,4);
		System.out.println("��ת�������飺"+Arrays.toString(arr));

	}

	/**
	 * ��ԭ����ֳ������֣��ָ��Ϊ��ת�������������һλ��ԭ�����λ��
	 * @param nums
	 * @param k
	 */
	public static void rotate(int[] arr, int k) {
		if (arr == null || arr.length <= 1 || k <= 0) {
			return;
		}
		int len = arr.length;
		k %= len;
		reverse(arr, 0, len - k - 1);//����ǰ�벿��
		reverse(arr, len - k, arr.length - 1);//������벿��
		reverse(arr, 0, arr.length - 1);//��������

	}

	/**
	 * ��ת�ƶ���Χ�ڵ�����
	 * @param nums
	 * @param start
	 * @param end
	 */
	public static void reverse(int[] arr, int start, int end) {
		int time = (end - start + 1) / 2;//��������
		for (int i = 0; i < time; i++) {//һͷһβ�໥����
			int temp = arr[end - i];
			arr[end - i] = arr[start + i];
			arr[start + i] = temp;
//			System.out.println(Arrays.toString(arr));
		}
		
	}

	 /**
     * �����������
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
