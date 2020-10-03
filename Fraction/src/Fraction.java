public class Fraction {
    int a, b;

    public Fraction(int Nominateur, int Denominateur){
        this.a = Nominateur;
        this.b = Denominateur;
    }

    public String toString(){
        return a + "/" + b;
    }
}
