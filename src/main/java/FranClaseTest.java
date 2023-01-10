import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FranClaseTest {

    @Test
    public void dia_laboralLunes() {
        FranClase classe = new FranClase();
        boolean result = classe.dia_laboral("Lunes");
        assertEquals(true,result);

    }
    @Test
    public void dia_laboralMartes() {
        FranClase classe = new FranClase();
        boolean result = classe.dia_laboral("Martes");
        assertEquals(true,result);

    }
    @Test
    public void dia_laboralMiercoles() {
        FranClase classe = new FranClase();
        boolean result = classe.dia_laboral("Miercoles");
        assertEquals(true,result);

    }
    @Test
    public void dia_laboralJueves() {
        FranClase classe = new FranClase();
        boolean result = classe.dia_laboral("Prueba");
        assertEquals(true,result);

    }
    @Test
    public void dia_laboralViernes() {
        FranClase classe = new FranClase();
        boolean result = classe.dia_laboral("Viernes");
        assertEquals(true,result);

    }
    @Test
    public void dia_laboralSabado() {
        FranClase classe = new FranClase();
        boolean result = classe.dia_laboral("Sabado");
        assertEquals(false,result);

    }
    @Test
    public void dia_laboralDomingo() {
        FranClase classe = new FranClase();
        boolean result = classe.dia_laboral("Domingo");
        assertEquals(false,result);

    }
    @Test
    public void dia_laboralDiaMalPuesto() {
        FranClase classe = new FranClase();
        boolean result = classe.dia_laboral(".");
        assertEquals(false,result);

    }

}