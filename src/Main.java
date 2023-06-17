public class Main {
    public static void main(String[] args) {
        SUV fortuner = new SUV("Fortuner",false);
        fortuner.move(40,0);
        fortuner.accelarate(20);
      //  fortuner.accelarate(-60);
        System.out.println("current gear :" + fortuner.getCurrentGear());
        System.out.println("current speed :" + fortuner.getCurrentSpeed());
    }
}
