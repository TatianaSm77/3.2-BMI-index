public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
       double weight = 70;
        double height = 1.8;
        double bmiIndex = service.calculate (weight,height);

        System.out.println("Ваш индекс массы тела:" + bmiIndex);
    }
}