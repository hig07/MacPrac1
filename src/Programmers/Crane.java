package Programmers;

public class Crane {
    public int solution(int[] nums) {
        int answer = -1;
        boolean[] visited = new boolean[nums.length];
        int n = nums.length;
        
        for(int i = 1; i <= n; i++){
            combination(nums, visited, 0, n, i);
        }
        
        return answer;
    }

    public void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        } 
    
        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    public void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
