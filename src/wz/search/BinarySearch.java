package wz.search;

/**
 * BinarySearch
 *
 * @author wz
 * @date 2016年04月21日 22:17
 */
public class BinarySearch {
    public int binarySearch(int[] array,int target){
        int left=0,right = array.length-1,middle;

        while (left<=right){
            middle = (left+right)/2;
            if (target == array[middle])
                return middle;
            else if (target>array[middle])
                left = middle+1;
            else
                right = middle-1;
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

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        System.out.println(new BinarySearch().binarySearch(array,4));
        System.out.println(new BinarySearch().recursiveBinarySearch(array, 4,0,array.length-1));
    }
}
