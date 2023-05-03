import Utilidades.Combustible;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DosRuedasTest {
    @Test
    public void encenderDosRuedasTest(){
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        //Si le doy true a arrancarApagarVehiculo tiene que regresar true
        boolean encedio = dosRuedas.arrancarApagarVehiculo(true);
        Assert.assertEquals(encedio, true);
    }

    @Test
    public void tipoCombustibleGasolinaTest(){
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        System.out.println(dosRuedas.getCombustible());
        Assert.assertEquals(dosRuedas.getCombustible(), Combustible.GASOLINA);
    }

    @Test
    public void tipoCombustibleIsNotTurbosina(){
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        System.out.println(dosRuedas.getCombustible());
        Assert.assertNotEquals(dosRuedas.getCombustible(), Combustible.TURBOSINA);
    }
}
