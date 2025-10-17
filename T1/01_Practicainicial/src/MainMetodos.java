public class MainMetodos {
    public static void main (String[] args) {
        System.out.println("Main para probar métodos y variables");
        saludar("Elena"); //Aquí le estoy asignando un valor a data, que es lo que me pide saludar, aquí estoy llamando al metodo
        saludar("Marta");
        despedir();
    }

    public static void saludar (String data){ //saludar así escrito es un metodo que necesita un dato para funiconar, aquí estoy declarando el metodo
        System.out.println("Enhorabuena "+data+" has llamado a tu primer método.");
    }

    public static void despedir (){
        System.out.println("Hasta luego Mari Carmen");
    }
}
