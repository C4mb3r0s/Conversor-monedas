import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        APIService service = new APIService();
        Scanner lecture = new Scanner(System.in);
        double monedaDeCambio;
        int opcion;

        do {
            System.out.println("******************************************************************");
            System.out.println("Sea bienvenido al conversor de Moneda\n");
            System.out.println("******************************************************************");
            System.out.println("1) Dólar --> Peso Argentino");
            System.out.println("2) Peso Argentino --> Dólar");
            System.out.println("3) Dólar --> Real Brasileño");
            System.out.println("4) Real Brasileño --> Dólar");
            System.out.println("5) Dólar --> Peso Colombiano");
            System.out.println("6) Peso Colombiano --> Dólar");
            System.out.println("7) Dólar --> Peso Mexicano");
            System.out.println("8) Peso Mexicano --> Dólar");
            System.out.println("0) Salir");
            System.out.println("******************************************************************");
            System.out.println("Elige una opcion:");
            opcion = lecture.nextInt();
            System.out.println("******************************************************************");

           switch (opcion){
                case 1:
                    System.out.println("Se realizará la conversion de Dólar americano a Peso argentino -->");
                    System.out.println("Ingresa la cantidad de Dolares americanos que posees:");
                    monedaDeCambio = lecture.nextDouble();
                    System.out.println("******************************************************************");
                    System.out.println("Tienes total de: "+ service.GestionDeConsulta("USD","ARS", monedaDeCambio) + " Pesos argentinos");
                    break;
                case 2:
                    System.out.println("Se realizará la conversion de Peso Argentino a Dolar americano -->");
                    System.out.println("Ingresa la cantidad de Pesos argentinos que posees:");
                    monedaDeCambio = lecture.nextDouble();
                    System.out.println("******************************************************************");
                    System.out.println("Tienes total de: "+ service.GestionDeConsulta("ARS","USD", monedaDeCambio) + " Dolares americanos.");
                    break;
                case 3:
                    System.out.println("Se realizará la conversion de Dolar americano a Real brasileño -->");
                    System.out.println("Ingresa la cantidad de Dolares americanos que posees:");
                    monedaDeCambio = lecture.nextDouble();
                    System.out.println("******************************************************************");
                    System.out.println("Tienes total de: "+ service.GestionDeConsulta("USD","BRL", monedaDeCambio) + " Reales brasileños.");
                    break;
                case 4:
                    System.out.println("Se realizará la conversion de Real brasileño a Dolar americano -->");
                    System.out.println("Ingresa la cantidad de Reales brasileños que posees:");
                    monedaDeCambio = lecture.nextDouble();
                    System.out.println("******************************************************************");
                    System.out.println("Tienes total de: "+ service.GestionDeConsulta("BRL","USD", monedaDeCambio) + " Dolares americanos.");
                    break;
                case 5:
                    System.out.println("Se realizará la conversion de Dolar americano a Peso colombiano -->");
                    System.out.println("Ingresa la cantidad de Dolares americanos que posees:");
                    monedaDeCambio = lecture.nextDouble();
                    System.out.println("******************************************************************");
                    System.out.println("Tienes total de: "+ service.GestionDeConsulta("USD","COP", monedaDeCambio) + " Pesos colombianos.");
                    break;
                case 6:
                    System.out.println("Se realizará la conversion de Peso colombiano a Dolar americano -->");
                    System.out.println("Ingresa la cantidad de Pesos colombianos que posees:");
                    monedaDeCambio = lecture.nextDouble();
                    System.out.println("******************************************************************");
                    System.out.println("Tienes total de: "+ service.GestionDeConsulta("COP","USD", monedaDeCambio) + " Dolares americanos.");
                    break;
                case 7:
                    System.out.println("Se realizará la conversion de Dolar americano a Peso mexicano -->");
                    System.out.println("Ingresa la cantidad de Dolares americanos que posees:");
                    monedaDeCambio = lecture.nextDouble();
                    System.out.println("******************************************************************");
                    System.out.println("Tienes total de: "+ service.GestionDeConsulta("USD","MXN", monedaDeCambio) + " Pesos mexicanos.");
                    break;
                case 8:
                    System.out.println("Se realizará la conversion de Peso mexicano a Dolar americano -->");
                    System.out.println("Ingresa la cantidad de Pesos mexicanos que posees:");
                    monedaDeCambio = lecture.nextDouble();
                    System.out.println("******************************************************************");
                    System.out.println("Tienes total de: "+ service.GestionDeConsulta("MXN","USD", monedaDeCambio) + " Dolares americanos.");
                    break;
                default:
                    System.out.println("Opcion no encontrada, intenta de nuevo");
            }
        } while (opcion != 0);
        System.out.println("Gracias por usar nuestro conversor de monedas");
    }
}
