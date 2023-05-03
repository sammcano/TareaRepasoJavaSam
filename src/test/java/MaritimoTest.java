import Utilidades.Combustible;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaritimoTest {
    @Test
    public void encenderMaritimoTest(){
        Maritimo maritimo = new Maritimo(Combustible.GASOIL);
        //Si le doy true a arrancarApagarVehiculo tiene que regresar true
        boolean encedio = maritimo.arrancarApagarVehiculo(true);
        Assert.assertEquals(encedio, true);
    }

    @Test
    public void apagarMaritimoTest(){
        Maritimo maritimo = new Maritimo(Combustible.GASOIL);
        //Si le doy false a arrancarApagarVehiculo tiene que regresar false
        boolean apagado = maritimo.arrancarApagarVehiculo(false);
        Assert.assertEquals(apagado, false);
    }

    @Test
    public void tipoCombustibleGasolinaTest(){
        Maritimo maritimo = new Maritimo(Combustible.GASOIL);
        System.out.println(maritimo.getCombustible());
        Assert.assertEquals(maritimo.getCombustible(), Combustible.GASOIL);
    }

    @Test
    public void tipoCombustibleIsNotTurbosina(){
        Maritimo maritimo = new Maritimo(Combustible.GASOIL);
        System.out.println(maritimo.getCombustible());
        Assert.assertNotEquals(maritimo.getCombustible(), Combustible.TURBOSINA);
    }
}
