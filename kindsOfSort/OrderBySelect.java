public class OrderBySelect{
    public static int[] orderBySelect(int[] a){
        for(int i=0;i<a.length;i++){
            int temp=a[i];
            int flag=i;
            for(int j=i+1;j<a.length;j++){
                if(temp>a[j]){
                    temp=a[j];
                    flag=j;
                }
            }
            if(flag!=i){
                a[flag]=a[i];
                a[i]=temp;
            }
        }
        return a;
    }
}
/*
 *选择排序(以递增排序为例)：通过内部循环第一次遍历数组找到最小的元素与数组的第一个元素交换位置，第二次遍历数组找到第二小的元素与数组的第二个元素交换位置，当内存循环找到最小的元素并交换位置后下次遍历时应该避开这个最小元素。这种排序方法对任何结构的数组都是O(n²)的时间复杂度 
 */