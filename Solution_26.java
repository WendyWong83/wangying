package leecode;

import java.util.Arrays;
import java.util.Random;

/**
 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 * @author WANGYING
 *
 */
public class Solution_26 {

	
	public static void main(String[] args) {
		int[] arr = newArr(15);
		System.out.println("ԭ���飺"+Arrays.toString(arr));
		sort(arr);
		System.out.println("��������飺" +Arrays.toString(arr));
		System.out.println("ȥ�غ������³��ȣ�"+distinct(arr));
		
       
	}
    
    /**
     * ����ɾȥ�ظ�Ԫ�غ�ĳ���
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
     * �����������
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
     * ��������������
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
