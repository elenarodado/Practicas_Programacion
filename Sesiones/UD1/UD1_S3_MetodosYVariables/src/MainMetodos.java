public class MainMetodos {

    public static void main(String[] args) {
        System.out.println("Main  para probar metodos y variables");
        saludar("Elena");
        saludar("Alejandro");
        despedir();
    }

    public static void saludar (String data){
        System.out.println("Enhorabuna "+data+" has llamado a tu primer metodo");
    }

    public static void despedir (){
        System.out.println("Hasta luego, hemos terminado");
    }
}
