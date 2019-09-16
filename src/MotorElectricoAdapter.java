public class MotorElectricoAdapter extends Motor {
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        super();
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando motor Electrico adapter");
    }

    public void encender() {
        System.out.println("Encendiendo motorElectricoAdapter");
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    public void acelerar() {
        System.out.println("Acelerando motor electrico...");
        motorElectrico.moverMasRapido();
    }

    public void apagar() {
        System.out.println("Apagando motor electrico");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}
