public class BmiService {
    public double calculate (double height,int weight) {

        double BodyMassIndex = weight / (height * height);

        return BodyMassIndex;
    }
}
