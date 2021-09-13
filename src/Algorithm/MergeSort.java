package Algorithm;

public class MergeSort {

    private static int[] sorted;
/*     //재귀없이 bottom-up 방식

    public void merge_sort(int[] data, int left, int right){
        for(int size = 1; size <= right; size += size) {
			
			 * 두 부분리스트을 순서대로 병합해준다.
			 * 예로들어 현재 부분리스트의 크기가 1(size=1)일 때
			 * 왼쪽 부분리스트(low ~ mid)와 오른쪽 부분리스트(mid + 1 ~ high)를 생각하면
			 * 왼쪽 부분리스트는 low = mid = 0 이고,
			 * 오른쪽 부분리스트는 mid + 1부터 low + (2 * size) - 1 = 1 이 된다.
			 *  
			 * 이 때 high가 배열의 인덱스를 넘어갈 수 있으므로 right와 둘 중 작은 값이
			 * 병합되도록 해야한다. 
             * 
			for(int l = 0; l <= right - size; l += (2 * size)) {
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(l + (2 * size) - 1, right);
				merge(a, low, mid, high);  // 병합작업
			}
    }
*/

  // 재귀를 이용한 top-down 방식
    public static void main(String[] args){
        int[] array = {1, 10, 5, 8, 7, 6, 2, 3, 9, 4};
        sorted = new int[array.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.merge_sort(array, 0, array.length - 1);
        sorted = null;

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public void merge_sort(int[] data, int left, int right){
        if(left == right){
            return;
        }
        int mid = (left + right) / 2;

        merge_sort(data, left, mid);
        merge_sort(data, mid + 1, right);

        merge(data, left, mid, right);
    }

    public void merge(int[] data, int left, int mid, int right){
        int l = left;
        int r = mid + 1;
        int idx = left;

        while((l <= mid) && (r <= right)){
            if(data[l] <= data[r]){
                sorted[idx] = data[l];
                idx++;
                l++;
            }
            else{
                sorted[idx] = data[r];
                idx++;
                r++;
            }
        }

        if(l > mid){
            while(r <= right){
                sorted[idx] = data[r];
                idx++;
                r++;
            }
        }
        else{
            while(l <= mid){
                sorted[idx] = data[l];
                idx++;
                l++;
            }
        }

        for(int i = left; i <= right; i++){
            data[i] = sorted[i];
        }
    }
}
