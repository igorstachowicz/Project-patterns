import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fasada {
    private static int wybor;

    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("1. Ferrari \n");
            System.out.print("2. Lamborghini \n");
            System.out.print("3. Mclaren \n");
            System.out.print("4. Porsche \n");
            System.out.print("5. Wyjście \n");
            System.out.print("Wybierz numer: \n\n");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            wybor = Integer.parseInt(br.readLine());
            Sprzedawca s = new Sprzedawca();

            switch (wybor) {
                case 1: {
                    s.ferrariSale();
                }
                    break;
                case 2: {
                    s.lamborghiniSale();
                }
                    break;
                case 3: {
                    s.mclarenSale();
                }
                    break;
                case 4: {
                    s.porscheSale();
                }
                    break;
                default: {
                    System.out.println("Nic nie kupiłeś");
                }
                    return;
            }

        } while (wybor != 4);
    }
}