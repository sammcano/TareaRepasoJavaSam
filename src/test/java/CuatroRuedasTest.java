import Utilidades.Combustible;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CuatroRuedasTest {
    @Test
    public void encenderCuatroRuedasTest(){
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOLINA);
        //Si le doy true a arrancarApagarVehiculo tiene que regresar true
        boolean encedio = cuatroRuedas.arrancarApagarVehiculo(true);
        Assert.assertEquals(encedio, true);
    }

    @Test
    public void apagarCuatroRuedasTest(){
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOLINA);
        //Si le doy false a arrancarApagarVehiculo tiene que regresar false
        boolean encedio = cuatroRuedas.arrancarApagarVehiculo(false);
        Assert.assertEquals(encedio, false);
    }

    @Test
    public void tipoCombustibleIsNotDiesel(){
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOLINA);
        System.out.println(cuatroRuedas.getCombustible());
        Assert.assertNotEquals(cuatroRuedas.getCombustible(), Combustible.DIESEL);
    }
}
