import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class operaciones_aritmeticasTest {

    operaciones_aritmeticas op = new operaciones_aritmeticas();


    @Test
    public void testResta(){

        assertEquals(3, operaciones_aritmeticas.resta(7,4));
    }

    @Test
    public void testMultiplicacion(){

        assertEquals(28, operaciones_aritmeticas.multiplicacion(7,4));
    }

}
