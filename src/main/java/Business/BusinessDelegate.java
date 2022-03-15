package Business;

import Services.VideoStreamingService;
import lombok.Setter;

//O business delegate utiliza uma pesquisa de negócios para rotear solicitações
// para um serviço de streaming de vídeo adequado.
@Setter
public class BusinessDelegate {

    private BusinessLookup lookupService;

    public String playbackPlataform(String plataform) {
        VideoStreamingService videoStreamingService = lookupService.getBusinessService(plataform);
        return videoStreamingService.doProcessing();
    }
}
