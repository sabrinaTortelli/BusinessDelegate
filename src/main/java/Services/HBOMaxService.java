package Services;

//Implementação da interface do serviço de streaming YouTube
public class HBOMaxService implements VideoStreamingService{

    @Override
    public String doProcessing() {
        System.out.println("HBOMaxService is now processing");
        return "Você será redirecionado para a Plataforma HBO Max!";
    }
}
