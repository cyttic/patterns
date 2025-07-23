package adapter;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class EffectiveJavaItem20Demo {
    public static void main(String[] args){
        int[]arr = new int[]{1,2,3,4,5};
        List<Integer>vv = intArrayAsList(arr);
        System.out.println(vv);
    }
    static List<Integer> intArrayAsList(int[]a){
        Objects.requireNonNull(a);
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }
            @Override
            public int size() {
                return a.length;
            }
            @Override
            public Integer set(int i, Integer val){
                int oldVal = a[i];
                a[i] = val;
                return oldVal;
            }
        };
    }
}
