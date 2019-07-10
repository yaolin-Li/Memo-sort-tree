public class QuickSort{
    public static void quickSort(int[] a){
        sort(a,0,a.length-1);
    }

    /**
     * 快速排序
     * @param a 目标数组
     * @param begin 起始下标
     * @param end 终止下标
     */
    private static void sort(int[] a, int begin, int end) {
        int i,j,index;
        if(begin>=end)//数组合法性判定
            return;
        i=begin;
        j=end;
        index=a[i];//拷贝第一个元素
        //以下循环主要完成将一个数组平分成两部分，左边部分的每一个值均小于右边的每一个值
        //原理：一次循环中分别从尾端向首端遍历找到一个小于index的元素并赋值给a[i](a[i]的值保存在index中不会丢失),这时候尾端的元素可
        //通过j作为下标找到，接下来通过首端向尾端遍历找到一个大于index的元素并赋值给之前已经赋值到左
        //部分的元素，这些条件都是在i<j的情况下执行的，保证了遍历不会过界的问题，
        while(i<j){
            while(i<j&&a[j]>=index)
                j--;
            if(i<j)
                a[i++]=a[j];
            while(i<j&&a[i]<index)
                i++;
            if(i<j)
                a[j--]=a[i];
        }
        a[i]=index;
        sort(a,begin,i-1);//递归直到只有一个元素的数组，这时候整个数组就已经排好序
        sort(a,i+1,end);
    }
}