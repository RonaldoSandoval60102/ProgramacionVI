package concreteCreator;

import concreteProduct.CalendarAPIImpl;
import concreteProduct.OpenAIAPIImpl;
import concreteProduct.SpotifyAPIImpl;
import creator.FactoryAPI;
import product.CalendarAPI;
import product.OpenAIAPI;
import product.SpotifyAPI;

public class VirtualAssitand extends FactoryAPI {

    @Override
    public CalendarAPI createCalendarAPI(String eventName, String date) {
        return new CalendarAPIImpl(eventName, date);
    }

    @Override
    public OpenAIAPI createOpenAIAPI(String textRequest) {
        return new OpenAIAPIImpl(textRequest);
    }

    @Override
    public SpotifyAPI createSpotifyAPI(String songName) {
        return new SpotifyAPIImpl(songName);
    }
}
