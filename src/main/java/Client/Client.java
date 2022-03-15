package Client;

import Business.BusinessDelegate;

//O cliente utiliza o business delegate para chamar a camada de
// negócios de acordo com o filme escolhido (plataforma de Streaming).
public class Client {

    private final BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public String choosePlataform(String plataform) {
        return businessDelegate.playbackPlataform(plataform);
    }

}
