package precencial;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        System.out.println("El mail fue movido a spam, no corresponde a ninguna area");
        return "mail movido a SPAM";
    }
}
