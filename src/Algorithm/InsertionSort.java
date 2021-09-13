package Algorithm;

public class InsertionSort {
    public void sort(int[] data){
        int size = data.length;
        int temp;

        for(int i = 1; i < size; i++){
            temp = data[i];
            int j = i - 1;

            while((j >= 0) && (temp < data[j])){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    public static void main(String[] args){
        int[] array = {66, 10, 1, 99, 5};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
