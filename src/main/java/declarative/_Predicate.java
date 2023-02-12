package declarative;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        /** Predicate<T> : represent a boolean valued finction of one argument **/

        System.out.println(isPhoneValide.test("0776543234")); //this is a valide phone number !
        System.out.println(isPhoneValide.test("08776545653"));//this is not a valide phone number !

    }

   static Predicate<String> isPhoneValide =
            phone -> phone.startsWith("07") && phone.length() == 10;
}
