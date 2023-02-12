package declarative;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        /** Consumer<T> : accepte one argument (T)  and has no return result **/

        Consumer<Personne> personneConsumer = personne ->
                System.out.println("Hello "+personne.name+", Your number is: "+personne.phoneNumber);

        Personne personne = new Personne("Taha", "+213542664168");

        personneConsumer.accept(personne);

    }

    static class Personne{

        private final String name;
        private final String phoneNumber;

        Personne(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
