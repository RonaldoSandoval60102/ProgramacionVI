import creator.FactoryAPI;
import enums.FactoryType;

public class App {
    public static void main(String[] args) throws Exception {   
        FactoryAPI virtualAssitand = FactoryAPI.getFactory(FactoryType.VIRTUAL_ASSITAND);
        System.out.println(virtualAssitand.createCalendarAPI("Meeting", "2021-10-10"));
        System.out.println(virtualAssitand.createOpenAIAPI("What is the meaning of life?"));
        System.out.println(virtualAssitand.createSpotifyAPI("Bohemian Rhapsody"));
    }
}