package Line;

import java.util.Collections;
import java.util.LinkedList;

public class Test1 {
    public String solution(String source) {
        String dest = "";
        char tmp = ' ';

        if(source.length() == 0){
            System.out.println(dest);
        }
        else{
            LinkedList<Character> q = new LinkedList<Character>();
            for(int i = 0; i < source.length(); i++){
                char cur = source.charAt(i);
                q.add(cur);
            }
            Collections.sort(q);
            
            while(!q.isEmpty()){
                if(q.size() == 1){
                    dest += q.pop();
                }
                else if(q.peek() != tmp){
                    dest += q.peek();
                    tmp = q.pop();
                }
                else{
                    q.add(q.pop());
                }
            }
        }
        return dest;
    }
}
