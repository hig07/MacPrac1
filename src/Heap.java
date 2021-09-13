import java.util.PriorityQueue;

public class Heap {
    //완전 이진 트리에서 형제 노드끼리의 우선순위는 고려 X
    //즉, 반 정렬상태
    public static void main(String[] args){
        int[] array = {3, 5, 6, 1, 2, 9, 4};

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for(int i = 0; i < array.length; i++){
            heap.add(array[i]);
        }

        for(int i = 0; i < array.length; i++){
            array[i] = heap.poll();
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
