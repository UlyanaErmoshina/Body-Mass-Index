public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 2.61;
        int weight = 10;
        double BodyMassIndex = service.calculate(height,weight);
        System.out.println(BodyMassIndex);
    }
}