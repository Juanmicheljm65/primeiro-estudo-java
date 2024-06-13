public class Temperature {
    public static void main(String[] args) {
        double temperaturaCelsius = 30.4;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.2f graus Celsius é exatamente igual a %.2f graus Fahrenheit, e arredondando seriam %d graus Fahrenheit", temperaturaCelsius, temperaturaFahrenheit, (int) temperaturaFahrenheit);
        System.out.println(mensagem);
    }
}
