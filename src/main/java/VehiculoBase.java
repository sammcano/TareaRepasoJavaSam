import Utilidades.Combustible;

public class VehiculoBase {
    private Combustible Combustible;
    public String Modelo;
    public String Marca;
    public int numeroLlantas;

    public VehiculoBase(Combustible tipoCombustible){
        this.Combustible = tipoCombustible;
    }

    public boolean arrancarApagarVehiculo(boolean encender){
        System.out.println("El vehiculo se necesita encender:" + encender);
        if(encender){
            System.out.println("El vehiculo esta encendido");
            return true;
        }
        else {
            System.out.println("El vehiculo esta apagado");
            return false;
        }
    }

    public Combustible getCombustible(){
        return this.Combustible;
    }

    public static class CuatroRuedas {
    }
}
