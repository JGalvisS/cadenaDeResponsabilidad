package precencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComprubaMailTest {
    @Test

    public void compruebaCadena() {
        //DADO
        Mail mail = new Mail("jessicag@digitalhouse.com", "consulta@pizzeria.com", "variedades");
        CompruebaMail cmail = new CompruebaMail();
        //CUANDO
        String respuestaEsp="mail movido a SPAM";
        String respuestaAct= cmail.compruebaMail(mail);
        //ENTONCES
        Assertions.assertEquals(respuestaEsp,respuestaAct);
    }
}
