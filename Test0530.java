//杨辉三角
package lianxi0530;

import java.util.ArrayList;
import java.util.List;

public class Test0530 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int numRows = 7;
        List<List<Integer>> list = new ArrayList<>();
        list = s.generate(numRows);
        System.out.println(list);
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int a = 1;
        int i = 0;
        while(i < numRows){
            List<Integer> list1 = new ArrayList<>();
            for(int j = 0;j<i+1;j++){
                if( j == 0||j == i){
                    list1.add(1);
                }else{
                    list1.add(list.get(i-1).get(j-1) + list.get(i-1).get(j) );
                }
            }
            list.add(list1);
            i++;
        }
        return list;

    }
}
