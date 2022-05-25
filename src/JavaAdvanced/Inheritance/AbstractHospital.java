package JavaAdvanced.Inheritance;

import java.util.function.Consumer;

class Hospital {
    private final Consumer<String> treatment;

    Hospital(Consumer<String> treatment) {
        this.treatment = treatment;
    }

    void process(String patient) {
        identify(patient);
        treatment.accept(patient);
    }

    private void identify(String patient) {
        System.out.println("Confirming identity of " + patient);
    }

    private void treat(String patient) {
        treatment.accept(patient);
    }
}

//class RealHospital extends AbstractHospital {
//    @Override
//    protected void treat(String patient) {
//        System.out.println("Performing surgery on " + patient);
//    }
//}
//
//class PseudoHospital extends AbstractHospital {
//    @Override
//    protected void treat(String patient) {
//        System.out.println("Sending good vibrations to " + patient);
//    }
//}

class CompositionExercise {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(s -> System.out.println("Sending good vibrations to " + s));
        hospital.process("Larry");

        /*
         * Zadanie: przerób kod w taki sposób, żeby zawierał tylko jedną klasę Hospital.
         * Klasa ta powinna posiadać pole zastępujące obecną abstrakcyjną metodę treat().
         * Zastanów się, jaki powinien być typ tego pola (czy treat() zachowuje się jak Function, Predicate, Consumer czy Supplier?)
         * Zadbaj o to, żeby każdy tworzony Hospital miał ustawione to pole w momencie utworzenia i żeby nie dało się go zmienić.
         * W metodzie main() utwórz dwie instancje szpitali leczących ludzi na różne sposoby i zademonstruj ich działanie.
         * bonus: w metodzie main() użyj lambd
         * */
    }
}