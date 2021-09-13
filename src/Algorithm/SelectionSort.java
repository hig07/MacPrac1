package Algorithm;

public class SelectionSort {  //선택 정렬은 최소값을 찾은 후 교환
    public void sort(int[] data){
        int min, temp;
        int size = data.length;
        
        for(int i = 0; i < size; i++){
            min = i;
            for(int j = i + 1; j < size; j++){
                if(data[min] > data[j]){
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }   
    }
    public static void main(String[] args){
        int[] array = {66, 10, 1, 99, 5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
