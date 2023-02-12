package declarative;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int result = incrementNumberByOne.apply(6);
        System.out.println("Function<T, R> result: "+result);


        /** Function<T, R> : use AndThen()**/

         Function<Integer, Integer> resultTwo = incrementNumberByOne.andThen(multipleBy10);
        int result2= resultTwo.apply(6); //The result must be = 70
        System.out.println("Function<T, R> result using andThen: "+result2);




    }

    /** Function<T, R>  where T: is an argument & R is the result**/
    static Function<Integer, Integer> incrementNumberByOne =
            number -> number + 1;

    static Function<Integer, Integer> multipleBy10 =
            number -> number*10;


}
