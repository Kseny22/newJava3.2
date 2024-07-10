public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weightInKg = 98;

        double heightInMeters = 1.87;

        double bmi;

        bmi = weightInKg / (heightInMeters * heightInMeters);


        System.out.println("Индекс массы тела = " + (int) bmi);
    }
}