package _09_MyArrayList;

//Аррэй лист
//Представьте, что вы пишете оптимальную по памяти реализацию ArrayList для примитива int

import java.util.Arrays;
import java.util.function.IntPredicate;

public class MyArrayList {

    public MyArrayList(int[] collection){

        //по зданию не написано реализовывать полноценный класс, поэтому инициализация идет таким способом
        array  = collection;
        size = array.length;
    }

    private int[] array;
    private int size;

    public void deleteAll(IntPredicate predicate){
        // напишите свою реализацию. Единственный метод в предикате - boolean test(int)
        // т.е. надо все элементы массива почекать этим предикатом - если true, то удалять

        var count = (int)Arrays.stream(array).filter(predicate).count();

        if(count == 0){
            //нет смысла ничего удалять
            return;
        }

        //пересоздаем массив
        var newSize = size - count;
        var copyArray = new int[newSize];
        int i = 0;

        for (var value : array) {
            if(!predicate.test(value)){
                copyArray[i] = value;
                i++;
            }
        }

        array = copyArray;
        size = array.length;
    }

    public int[] ToArray(){
        return array;
    }
}
