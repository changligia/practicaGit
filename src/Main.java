public class Main {
    public static void main(String[] args) {
        //numerosImpares();
        //multiplosDeTres();
        multiplosDeCinco();
    }

    private static void numerosImpares() {
        for (var i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static void multiplosDeTres() {
        for (var i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static void multiplosDeCinco() {
        for (var i = 0; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
