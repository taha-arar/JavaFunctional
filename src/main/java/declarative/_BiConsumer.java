package declarative;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {

        /** BiConsumer<T1,T2> : accepte two arguments (T1,T2)  and has no return result **/


        Personne personne = new Personne("Taha", "+213542664168");

          showPersonne.accept(personne, true); //shows the phone number

          showPersonne.accept(personne, false); //does not show the phone number


    }

    static class Personne{

        private final String name;
        private final String phoneNumber;

        Personne(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

    static BiConsumer<Personne, Boolean> showPersonne =
            (personne, showPhone) -> System.out.println("Hey "+personne.name+", This is your number: "
            +(showPhone ? personne.phoneNumber : "No phone number !"));
}
