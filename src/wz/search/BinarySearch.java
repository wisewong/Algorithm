package wz.search;

/**
 * BinarySearch
 *
 * @author wz
 * @date 2016年04月21日 22:17
 */
public class BinarySearch {
    public int binarySearch(int[] array,int target){
        int left=0,right = array.length-1,mid;

        while (left<=right){
            mid = left + (right - left)/2;
            if (target == array[mid])
                return mid;
            else if (target>array[mid])
                left = mid+1;
            else
                right = mid-1;
        }
        return -1;
    }

    public int recursiveBinarySearch(int[] array,int target,int start,int end){
        if (start>end)
            return -1;
        int middle = (start+end)/2;
        if (array[middle]==target)
            return middle;
        else if (array[middle]<target)
            return recursiveBinarySearch(array, target,start,middle-1);
        else
            return recursiveBinarySearch(array,target,middle+1,end);
    }

    /**
     * 二分查找
     * 若找不到，则返回最后一个小于查找值的位置
     * @param arr
     * @param target
     * @return
     */
    private int binarySearchImprove(int[] arr,int target){
        if (arr == null || arr.length == 0) {
            return -2;
        }
        int left = 0,right = arr.length - 1, mid;
        while(left<=right){
            mid = left+(right-left)/2;
            System.out.println(mid);
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            }else if (target > arr[mid]) {
                left = mid + 1;
            }
        }
        if (arr[left]<target)
            return left;
        return right;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        System.out.println(new BinarySearch().binarySearch(array,4));
        System.out.println(new BinarySearch().recursiveBinarySearch(array, 4,0,array.length-1));
    }
}
