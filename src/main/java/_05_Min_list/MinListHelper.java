package _05_Min_list;

import java.util.Collection;
import java.util.Comparator;

//Мин лист
public class MinListHelper {
    public static <T> T findMin(Collection<T> collection, Comparator<? super T> comparator, long begin, long end){

        if(begin < 0 || end < 0){
            throw new IllegalArgumentException("begin and end must be positive or zero");
        }

        if(begin > end){
            throw new IllegalArgumentException("begin must be > then end");
        }

        var count = end - begin;
        return collection.stream().skip(begin).limit(count).min(comparator).get();
    }
}
