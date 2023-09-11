public class App {
    public static void main(String[] args) throws Exception {
        APIFactory apiFactory = new APIFactory();
        System.out.println(apiFactory.createCalendarAPI("Happy Birthday", "10/5/23"));
        System.out.println(apiFactory.createSpotifyAPI("NF - TRUST ft. Tech N9ne "));
        System.out.println(apiFactory.createOpenAI_API("Who is the President of the United States?"));
    }
}
