package declarative;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        /** Supplier<T> : Represent a supplier(A value it may be a static) of a results **/
        System.out.println(URLConnection.get());


    }
   static  Supplier<String> URLConnection = () -> "jdbc://localhost:8080/TestDB";

}
