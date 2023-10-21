package precencial;

public class ManejadorComercial extends Manejador {


    @Override
    public String comprobar(Mail mail) {
        if(mail.getDestino().equals("comercial@lacolmena.com")|| mail.getTema().equals("comercial")){
            System.out.println("En unos minutos desde el area Comercial lo atenderemos ");
            return "Esta siendo atendido por Comercial";
        }else{
            System.out.println("No pudimos atender su solicitud en el area Comercial lo derivaremos al area Tecnico ");
            return getSiguienteManejador().comprobar(mail);
        }

    }
}
