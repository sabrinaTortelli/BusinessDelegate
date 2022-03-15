package Services;

//Implementação da interface do serviço de streaming Netflix
public class NetflixService implements VideoStreamingService{

    @Override
    public String doProcessing() {
        System.out.println("NetflixService is now processing");
        return "Você será redirecionado para a Plataforma Netflix!";
    }
}
