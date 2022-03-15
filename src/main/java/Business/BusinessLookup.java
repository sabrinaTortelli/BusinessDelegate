package Business;

import Services.AmazonService;
import Services.NetflixService;
import Services.VideoStreamingService;
import Services.HBOMaxService;
import lombok.Setter;

//Serviço de pesquisa que decide qual serviço de streaming de
// vídeo é utilizado de acordo com a seleção do filme do usuário
@Setter
public class BusinessLookup {

    private NetflixService netflixService;
    private HBOMaxService HBOMaxService;
    private AmazonService amazonService;

    public VideoStreamingService getBusinessService(String plataform) {
        if (plataform.equals("netflix")) {
            return netflixService;
        } else if(plataform.equals("hbo")) {
            return HBOMaxService;
        } else {
            return amazonService;
        }
    }
}
