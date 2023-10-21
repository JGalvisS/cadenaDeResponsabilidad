package precencial;

public class CompruebaMail {
    private Manejador inicializador;

    public CompruebaMail(){
        //ESTOS SON LOS ESLABONES DE LA CADENA
        inicializador= new ManejadorComercial();
        Manejador tecnico = new ManejadorTecnico();
        Manejador gerencial= new ManejadorGerencial();
        Manejador spam = new ManejadorSpam();
        //ESTA ES LA CADENA
        inicializador.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(gerencial);
        gerencial.setSiguienteManejador(spam);

    }

    //ESTO DISPARA LA CADENA
    public String compruebaMail(Mail mail){
        return inicializador.comprobar(mail);
    }
}
