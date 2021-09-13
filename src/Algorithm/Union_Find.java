package Algorithm;

public class Union_Find {  //대표 그래프 알고리즘, 상호베타적 집합(Disjoint-Set)
    //Find 연산 : x가 어떤 집합에 포함되어 있는지 찾는 연산
    //Union 연산 : x, y가 포함되어 있는 집합을 합치는 연산
    //부모를 합칠 때는 일반적으로 더 작은 값 쪽으로 합칩 (예로 1, 2를 합치면 2의 인덱스에 1이 들어감)

    public static int[] parent = new int[100001];
    public static void main(String[] args){
        for(int i = 0; i < 8; i++){
            parent[i] = i;
        }
        union(1, 2);
        union(2, 3);
        union(3, 4);
        union(5, 6);
        union(6, 7);
        union(7, 8);

        System.out.println("1과 5는 연결되어 있나요? " + isSameParent(1, 5));
    }

    public static int find(int x){
        if(x == parent[x]){
            return x;
        }
        else{
            return parent[x] = find(parent[x]);
        }
    }

    public static void union(int x, int y){
        x = find(x);
        y = find(y);

        if(x > y){
            parent[x] = y;
        }
        else{
            parent[y] = x;
        }
    }

    public static boolean isSameParent(int x, int y){  //부모 노드가 같은지 확인
        x = find(x);
        y = find(y);
        if(x == y){
            return true;
        }
        else{
            return false;
        }
    }
}
