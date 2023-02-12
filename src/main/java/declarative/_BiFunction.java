package declarative;

import java.util.function.BiFunction;

public class _BiFunction {

    public static void main(String[] args) {

        int result = addition.apply(5,2);
        System.out.println("BiFunction(T1,T2,R) Addition: "+result);

        int result1 = multiple.apply(5,2);
        System.out.println("BiFunction2(T1,T2,R) Multiplication: "+result1);



    }

    /** BiFunction<T1,T2,R> : accepte two arguments (T1 & T2)  and return a result (R)**/

    static BiFunction<Integer, Integer, Integer> addition =
            (number1, number2) -> number1+number2;

    static BiFunction<Integer, Integer, Integer> multiple =
            (number1, number2) -> number1*number2;

}
