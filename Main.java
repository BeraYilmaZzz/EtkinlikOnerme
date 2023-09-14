import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int weather;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava kaç derece ? :");
        weather = inp.nextInt();
        if (weather >= 5) {
            if (weather ==5){
                System.out.println("KAYAK");
                System.out.println("SİNEMA");
            }
            else if ((weather >= 5) && (weather <= 15)) {
                System.out.println("SİNEMA");
            }
            if ((weather >= 15) && (weather <= 25)) {
                System.out.println("PİKNİK");
            }
            if (weather >= 25) {
                System.out.println("YÜZME");
            }
        } else {
            System.out.println("KAYAK");
        }
    }
}
// if else ve karşılaştırma operatörleri ile değer aralığı bulup yazdırma.