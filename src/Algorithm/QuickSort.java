package Algorithm;

public class QuickSort {
    public static int partition(int[] data, int left, int right){
        int pivot = data[(left + right) / 2];
        int temp;

        while(left < right){
            while((data[left] < pivot) && (left < right)){
                left++;
            }
            while((data[right] > pivot) && (left < right)){
                right--;
            }
            if(left < right){
                temp = data[left];
                data[left] = data[right];
                data[right] = temp;
            }
        }
        return left;
    }

    public static void sort(int[] data, int left, int right){
        if(left < right){
            int index = partition(data, left, right);
            sort(data, left, index - 1);
            sort(data, index + 1, right);
        }
    }

    public static void main(String[] args){
        int[] array = {1, 10, 5, 8, 7, 6, 2, 3, 9, 4};
        QuickSort.sort(array, 0, array.length - 1);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
