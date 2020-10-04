public class Main {

    public static void main(String[] args){
        Fraction frac = new Fraction(2, 1);

        assert frac.toString().equals("2/1"): "Error. 'Fraction' returns the wrong String.";
    }
}
