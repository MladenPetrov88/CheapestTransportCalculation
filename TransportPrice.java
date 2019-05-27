import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = Integer.parseInt(scanner.nextLine());
        String word = scanner.nextLine();
        double dayTaxi = 0.70 + (numN * 0.79);
        double nightTaxi = 0.70 + (numN * 0.90);
        double bus = numN * 0.09;
        double train = numN * 0.06;
        if (numN < 20 && word.equals("day")) {
            System.out.printf("%.2f ", dayTaxi);
        } else if (numN <20 && word.equals("night")) {
            System.out.printf("%.2f", nightTaxi);
        } else if (numN >= 20 && word.equals("day") && bus < dayTaxi && bus < nightTaxi && numN < 100) {
            System.out.printf("%.2f", bus);
        } else if (numN >= 20 && word.equals("night") && bus < dayTaxi && bus < nightTaxi && numN < 100) {
            System.out.printf("%.2f",bus);
        } else if (numN >= 100 && word.equals("day") && train < bus && train < dayTaxi && train < nightTaxi) {
            System.out.printf("%.2f", train);
        } else if (numN >= 100 && word.equals("night") && train < bus && train < dayTaxi && train < nightTaxi) {
            System.out.printf("%.2f", train);
        }

        }
    }

