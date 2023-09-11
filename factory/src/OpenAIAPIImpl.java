public class OpenAIAPIImpl implements OpenAIAPI{

    private String textRequest;

    public OpenAIAPIImpl(String textRequest){
        this.textRequest = textRequest;
    }


    @Override
    public String generateResponse(String input) {
        return "Request:" + input;
    }
    
    @Override
    public String toString(){
        return "[" + textRequest + "]";
    }
}
