package creator;
import concreteCreator.VirtualAssitand;
import enums.FactoryType;
import product.CalendarAPI;
import product.OpenAIAPI;
import product.SpotifyAPI;

public abstract class FactoryAPI {
    
    abstract public CalendarAPI createCalendarAPI(String eventName, String date);

    abstract public OpenAIAPI createOpenAIAPI(String textRequest);

    abstract public SpotifyAPI createSpotifyAPI(String songName);

    public static FactoryAPI getFactory(FactoryType type) {
        switch (type) {
            case VIRTUAL_ASSITAND:
                return new VirtualAssitand();
            default:
                return null;
        }
    }
}
