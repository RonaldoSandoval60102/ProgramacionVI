public class APIFactory {
    
    public static SpotifyAPI createSpotifyAPI(String songName) {
        return new SpotifyAPIImpl(songName);
    }

    public static OpenAIAPI createOpenAI_API(String textRequest) {
        return new OpenAIAPIImpl(textRequest);
    }

    public static CalendarAPI createCalendarAPI(String eventName, String date) {
        return new CalendarAPIImpl(eventName,date);
    }
}
