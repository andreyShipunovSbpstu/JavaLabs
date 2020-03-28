package _01_Simple_swap;

//Простой свап
public abstract class  SwapHelper {
    public static boolean Swap(int i, int j, int[] anArray) {

        if(i < 0 || i >= anArray.length){
            return false;
        }

        if(j < 0 || j >= anArray.length){
            return false;
        }

        var temp = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = temp;

        return true;
    }
}

