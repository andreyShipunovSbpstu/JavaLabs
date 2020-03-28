package _08_Paired_letters;

public class PairedLettersHelper {

    //Парные буквы

    /** Метод удаляет подряд идущие пары из строки
     *Сложность алгоритма O(N) */
    private static String deletePairedLettersInner(String input){

        if(input.length() <= 1){
            return input;
        }

        var result = new StringBuilder(input.length());

        for (int i = 1; i < input.length();)
        {
            if (input.charAt(i) == input.charAt(i - 1)){

                //если конец строки, то просто возвращаем результат
                if(i + 1 == input.length()){
                    return result.toString();
                }

                i+=2;
                //если после увеличения индекса наступил конец строки
                //то добавляем последний символ в конец строки и возвращаем результат
                if(i >= input.length())
                {
                    result.append(input.charAt(i - 1));
                    return result.toString();
                }
                continue;
            }
            else
            {
                //дубликатов нету, добавляем прошлый символ в результат
                result.append(input.charAt(i - 1));
            }
            i++;
        }

        //последний символ в строке всегда добавляем в конец, если не вышли из функции по ветке дубликатов
        result.append(input.charAt(input.length() - 1));

        return result.toString();
    }

    /** Удаляем подряд идущие пары из строки до тех пор пока находим какие-либо дубликаты
     * Сложность алгоритма O(N*N) */
    public static String deletePairedLetters(String input){

        if(input == null || input.length() <= 1){
            return input;
        }

        var oldString = input;
        boolean isEnd;
        do {
            var newString = deletePairedLettersInner(oldString);

            isEnd = newString.length() == oldString.length();

            oldString = newString;
        }
        while (!isEnd);

        return oldString;
    }
}
