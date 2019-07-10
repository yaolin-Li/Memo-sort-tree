public class OrderByBubbl{
    public static int[] orderByBubble(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    /**
     * 冒泡排序(以递增排序为例)：冒泡排序的思想是从左到右(从右到左)进行相邻元素的大小判定，如果后一个元素小于前一个元素，交换位置，一轮循环后最大值将在最右边　
     */
}