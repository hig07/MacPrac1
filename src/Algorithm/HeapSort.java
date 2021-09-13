package Algorithm;

public class HeapSort {

    public static void main(String[] args){
        //int[] array = {1, 10, 5, 8, 7, 6, 2, 3, 9, 4};
        int[] array = {66, 10, 1, 99, 5};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public void sort(int[] data){
        int size = data.length;

        if(size < 2){
            return;
        }
        /*
		 * left child node = index * 2 + 1
		 * right child node = index * 2 + 2
		 * parent node = (index - 1) / 2
		 */
        // 가장 마지막 요소의 부모 인덱스 
        int parentIdx = getParent(size - 1);

        // max heap
        for(int i = parentIdx; i >= 0; i--){
            heapify(data, i, size - 1);
        }
        /*
        *  root인 0번째 인덱스와 i번째 인덱스의 값을 교환해준 뒤
        *  0 ~ (i-1) 까지의 부분트리에 대해 max heap을 만족하도록
        *  재구성한다.
        */
        for(int i = size - 1; i > 0; i--){
            swap(data, 0, i);
            heapify(data, 0, i - 1);
        }
    
    }

    public static int getParent(int child){
        return (child - 1) / 2;
    }

    public void swap(int[] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void heapify(int[] data, int parentIdx, int lastIdx){
        /*
		 * 현재 트리에서 부모 노드의 자식노드 인덱스를 각각 구해준다.
		 * 현재 부모 인덱스를 가장 큰 값을 갖고있다고 가정한다.
		 */
        int leftChildIdx = parentIdx * 2 + 1;
        int rightChildIdx = parentIdx * 2 + 2;
        int largestIdx = parentIdx;

        /*
		 *  left child node와 비교
		 *  
		 *  자식노드 인덱스가 트리의 크기를 넘어가지 않으면서
		 *  현재 가장 큰 인덱스보다 왼쪽 자식노드의 값이 더 클경우
		 *  가장 큰 인덱스를 가리키는 largestIdx를 왼쪽 자식노드인덱스로 바꿔준다.
		 *  
		 */
        if((leftChildIdx <= lastIdx) && (data[leftChildIdx] > data[largestIdx])){
            largestIdx = leftChildIdx;
        }
        /*
		 *  left right node와 비교
		 *  
		 *  자식노드 인덱스가 트리의 크기를 넘어가지 않으면서
		 *  현재 가장 큰 인덱스보다 오른쪽쪽 자식노드의 값이 더 클경우
		 *  가장 큰 인덱스를 가리키는 largestIdx를 오른쪽 자식노드인덱스로 바꿔준다.
		 *  
		 */
        if((rightChildIdx <= lastIdx) && (data[rightChildIdx] > data[largestIdx])){
            largestIdx = rightChildIdx;
        }
        /*
		 * largestIdx 와 부모노드가 같지 않다는 것은
		 * 위 자식노드 비교 과정에서 현재 부모노드보다 큰 노드가 존재한다는 뜻이다.
		 * 그럴 경우 해당 자식 노드와 부모노드를 교환해주고,
		 * 교환 된 자식노드를 부모노드로 삼은 서브트리를 검사하도록 재귀 호출 한다.
		 */
        if(largestIdx != parentIdx){
            swap(data, largestIdx, parentIdx);
            heapify(data, largestIdx, lastIdx);
        }
    }
    
}
