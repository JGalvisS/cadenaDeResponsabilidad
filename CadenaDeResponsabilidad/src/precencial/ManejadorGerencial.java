package precencial;

public class ManejadorGerencial extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        if(mail.getDestino().equals("gerencial@lacolmena.com")|| mail.getTema().equals("gerencia")){
            System.out.println("En unos minutos desde el area de Gerencia lo atenderemos ");
            return "Esta siendo atendido por el area de Gerencia";
        }else{
            System.out.println("No pudimos atender su solicitud en el area de Gerencia lo almacenaremos en Spam  ");
            return getSiguienteManejador().comprobar(mail);
        }
    }
}
