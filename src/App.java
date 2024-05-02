public class App {
    public static void main(String[] args) throws Exception {
        JurosSimples calcularJuros = new JurosSimples(5000, 2, 0.08);
        calcularJuros.CalcularJuros();
        System.out.println(calcularJuros.getResultado());

    }
}
