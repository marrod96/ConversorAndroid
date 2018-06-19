package mariarodriguez.conversor;

public class ConvUnidades {

    //Monedas
    public static double DolarToEuros(double val) { //Convierte dólares a euros

        // Convierte a euros
        return val*0.86084;
    }
    public static double EurosToDolar(double val) {

        // Convierte a dólares
        return val*1.1617;
    }
    public static double EurosToLibras(double val) {
        // Convierte a libras
        return val*0.87465;
    }
    public static double EurosToYen(double val) {
        return val*126.86;
    }
    public static double YenToEuros(double val) {
        return val*0.00788;
    }
    public static double YenToLibras(double val) {
        return val*0.00691;
    }
    public static double DolarToLibras(double val) {
        return val*0.75;
    }
    public static double LibrasToDolar(double val) {
        return val*1.3281;
    }
    public static double LibrasToEuros(double val) {
        return val*1.1433;
    }
    public static double LibrasToYen(double val) {
        return val*144.69;
    }
    public static double DolarToYen(double val) {
        return val*109.841;
    }
    public static double YenToDolar(double val) {
        return val*0.0091;
    }


    //Temperaturas
    public static double CelsiusToKelvin(double val) { //Convierte de grados Celsius a Kelvin
        return val+273.15;
    }
    public static double KelvinToCelsius(double val) {
        return val-273.15;
    }

    public static double KelvinToFah(double val) {
        return (val-273.15)* 1.8 + 32;
    }

    public static double FahToKelvin(double val) {
        return (val-32)/ 1.8 + 273.15;
    }
    public static double CelsiusToFah(double val) {
        return val*1.8 + 32;

    }
    public static double FahToCelsius(double val) {
        return (val-32)/1.8;
    }

    //Energía

    public static double JuliosToKwh(double val) {
        return val/3600000;
    }

    public static double JuliosToKcal(double val) {
        return val/4186.8;
    }

    public static double KwhToJul(double val) {
        return val*3600000;
    }
    public static double KwhToKcal(double val) {
        return val*1000/1.163;
    }

    public static double KcalToJul(double val) {
        return val*4186.8;
    }
    public static double KcalToKwh(double val) {
        return val*0.001163;
    }
}

