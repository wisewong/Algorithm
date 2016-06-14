package wz.sort;

/**
 * HeapSort
 *
 * @author wz
 * @date 2016年04月21日 22:31
 */
public class HeapSort {
    public void heapSort(int[] array){
        for (int i = array.length/2 -1;i >= 0;i--)
            heapAdjust(array, i,array.length-1);

        for (int i = array.length-1;i>=0;i--){
            swap(array, 0, i);
            heapAdjust(array , 0,i-1);
        }
    }

    public void heapAdjust(int[] array, int start, int end){
        int temp = array[start],index = start;
        for (int i = (start+1)*2-1; i <= end; i = (i+1)*2-1) {
            if (i+1<=end && array[i]<array[i+1])
                i++;
            if (temp>array[i])
                break;
            array[index] = array[i];
            index = i;
        }
        array[index]=temp;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,2,7,4,2,1,1,4,3,10,8};
        new HeapSort().heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
