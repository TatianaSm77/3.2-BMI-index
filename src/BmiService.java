public class BmiService {
    public double calculate(double weight, double height) {
        double bmiIndex = weight / height;
        return (int) bmiIndex;
    }
}
