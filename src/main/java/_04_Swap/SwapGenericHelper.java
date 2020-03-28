package _04_Swap;

import java.util.List;

public abstract class SwapGenericHelper{
    public static <T> boolean SwapGeneric(int i, int j, List<T> anArray){
        if(i < 0 || i >= anArray.size()){
            return false;
        }

        if(j < 0 || j >= anArray.size()){
            return false;
        }

        var temp = anArray.get(i);
        anArray.set(i, anArray.get(j));
        anArray.set(j, temp);

        return true;
    }
}
