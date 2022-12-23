public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();
        double m = 66.5;
        double h = 1.76;
        double ind = index.calculate(m, h);
        System.out.println(ind);
    }
}