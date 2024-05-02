
public class JurosSimples {
    private double C;
    private double N;
    private double i;
    private double resultado;

    public JurosSimples(double C, double N, double i){
        this.C = C;
        this.N = N;
        this.i = i;
    }

    public void CalcularJuros(){
        this.resultado = (this.C*N)*i;
    }

    public double getResultado() {
        return resultado;
    }
}