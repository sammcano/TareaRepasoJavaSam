import Utilidades.Combustible;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AereoTest {
    @Test
    public void encenderAereoTest(){
        Aereo aereo = new Aereo(Combustible.TURBOSINA);
        //Si le doy true a arrancarApagarVehiculo tiene que regresar true
        boolean encedio = aereo.arrancarApagarVehiculo(true);
        Assert.assertEquals(encedio, true);
    }

    @Test
    public void apagarAereoTest(){
        Aereo aereo = new Aereo(Combustible.TURBOSINA);
        //Si le doy false a arrancarApagarVehiculo tiene que regresar false
        boolean encedio = aereo.arrancarApagarVehiculo(false);
        Assert.assertEquals(encedio, false);
    }

    @Test
    public void tipoCombustibleGasolinaTest(){
        Maritimo maritimo = new Maritimo(Combustible.TURBOSINA);
        System.out.println(maritimo.getCombustible());
        Assert.assertEquals(maritimo.getCombustible(), Combustible.TURBOSINA);
    }

}
