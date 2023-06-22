public class Main {
    public static void main(String[] args) {
        BmiService service1 = new BmiService();
        double h = 1.87;
        int m = 98;
        int bmi = service1.calculate(h, m);
        System.out.println(bmi);
    }
}