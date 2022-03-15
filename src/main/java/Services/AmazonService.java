package Services;

//Implementação da interface do serviço de streaming Amazon
public class AmazonService implements VideoStreamingService{

    @Override
    public String doProcessing() {
        System.out.println("AmazonService is now processing");
        return "Você será redirecionado para a Plataforma Amazon!";
    }
}
