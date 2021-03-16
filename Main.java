public class Main {
    public static void main (String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(45,1.53);
        System.out.format( "Mass Body Index: " + "%.2f",index);

    }
}
