package Algorithm;

public class BubbleSort {  //인접 원소 비교
    public void sort(int[] data){
        int size = data.length;
        int temp;

        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(data[i] > data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] array = {66, 10, 1, 99, 5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
