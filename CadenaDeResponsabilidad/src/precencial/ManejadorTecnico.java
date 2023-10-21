package precencial;

public class ManejadorTecnico extends Manejador{

    @Override
    public String comprobar(Mail mail) {
        if (mail.getDestino().equals("tecnico@lacolmena")||mail.getTema().equals("tecnico")){
            System.out.println("En pocos minutos lo atenderemos desde el area Tecnica");
            return "Esta siendo atendido por el area Tecnica";
        }else {
            System.out.println("Su solicitud no podra ser atendida por el area Tecnica lo derivaremos al area Gerencial");
            return getSiguienteManejador().comprobar(mail);
        }
    }
}
