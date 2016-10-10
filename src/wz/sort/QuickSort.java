package wz.sort;

import java.util.Random;

/**
 * QuickSort
 *
 * @author wz
 * @date 2016年04月21日 21:32
 */
public class QuickSort {
    public void quickSort(int[] array,int start,int end){
        if (start<end){
            int divide = partition(array,start,end);
            quickSort(array,0,divide-1);
            quickSort(array,divide+1,end);
        }
    }

    private int partition(int[] array, int start, int end) {
        swap(array, start, new Random().nextInt(end-start+1)+start);
        int left = start,right = end,temp = array[start];
        while (left<right){
            while (left<right && array[right]>=temp)
                right--;
            array[left] = array[right];
            while (left<right && array[left]<=temp)
                left++;
            array[right] = array[left];
        }
        array[left] = temp;
        return left;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,4,2,5,6,3,1};
        new QuickSort().quickSort(array,0,array.length-1 );
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
