import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> tmpList = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                tmpList.add(todo_list[i]);
            }
        }
        
        return tmpList.toArray(new String[0]);
    }
}