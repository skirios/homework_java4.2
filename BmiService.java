public class BmiService {
    public double calculate(int weight, double height ) {
        double massBodyIndex;
        massBodyIndex = weight / (height * height);
        return massBodyIndex;


    }
}
