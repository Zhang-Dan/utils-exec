package com.rxx.common.sort;

/**
 * Created by RRX on 16/5/2.
 */
public class InsertSort {

    public static void main(String[] args){
        int[] data = {36,54,76,23,56,41,98,54};
        straightInsertionSort(data,true);
        for(int i : data){
            System.out.print(i + "\t");
        }
    }


    /**
     *
     直接插入排序(Straight Insertion Sort)
         基本思想:
             将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。
             即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。
             要点：设立哨兵，作为临时存储和判断数组边界之用。
         直接插入排序示例：
             36 54  76  23  56  41  98  54

             36 54  76  23  56  41  98  54
             36-54	76	23	56	41	98	54
             36	54 -76	23	56	41	98	54
            -23	36	54	76	56	41	98	54
             23	36	54 -56	76	41	98	54
             23	36 -41	54	56	76	98	54
             23	36	41	54	56	76 -98	54
             23	36	41	54 -54	56	76	98
         效率：
             时间复杂度：O（n^2）.
     * @param data 待排序的数据
     * @param isASC true-升序,false-降序
     * @return
     */

    public static int[] straightInsertionSort(int[] data, boolean isASC){

        int len = 0;
        // 如果数组为空或者其中的数据少于两个,则直接返回数组
        if(null == data || (len = data.length) < 2 ){
            return data;
        }
        int temp = 0;
        int j = 0;
        for (int i = 1; i < len; i++){
            temp = data[i];
            for (j = i-1; j >= 0 && temp > data[j] ^ isASC; j--) {
                data[j + 1] = data[j];
            }
            data[j+1] = temp;
        }
        return data;
    }

    /**
     *
     希尔排序（Shell`s Sort）
        基本思想：
            先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
            待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
        操作方法：
             选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
             按增量序列个数k，对序列进行k 趟排序；
             每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     算法实现：
         我们简单处理增量序列：增量序列d = {n/2 ,n/4, n/8 .....1} n为要排序数的个数
         即：先将要排序的一组记录按某个增量d（n/2,n为要排序数的个数）分成若干组子序列，每组中记录的下标相差d.
         对每组中全部元素进行直接插入排序，然后再用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。
         继续不断缩小增量直至为1，最后使用直接插入排序完成排序。
     * @param data
     * @param isAsc
     * @return
     */
    public static int[] shellSort(int[] data, boolean isAsc){
        return data;
    }
}

