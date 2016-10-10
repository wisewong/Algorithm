package wz.algorithm;

/**
 * MatrixSearch
 * 二维矩阵 查找目标值
 * 每行从左至右递增
 * 每列从上至下递增
 *
 * @author wz
 * @date 16/10/10 10:50
 */
public class MatrixSearch {

    boolean find(int[][] martix,int target){
        if (martix == null)
            return false;

        int row = 0,col = martix[0].length;
        while(row<martix.length && col >= 0 ){
            if (martix[row][col] == target)
                return true;
            while (col>=0 && martix[row][col]>target)
                col--;
            while(row<martix.length && martix[row][target]<target)
                row++;

        }
        return false;
    }

}
