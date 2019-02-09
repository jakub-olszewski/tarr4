package pl.sdacademy.tarr4.petlawhile;

/**
 * PetlaWhileMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 11:46
 **/
public class PetlaWhileMain {
    public static void main(String[] args) {

        int rok = 2019;

        // petla while - dopuki
        while (rok < 2030){

            if(rok==2025){
                System.out.println("Koniec świata");
                return;// program przestaje działać
            }

            // instrukcje
            // \n - oznacza nową linię
            // %d - wstrzykuje liczbę d-decimal
            System.out.printf("W roku %d ludzie jedza mięso i warzywa\n",rok);
            //break;
            rok++;

        }
        System.out.println("W "+rok+" ludzie przestali jeść mięso");

    }
}
