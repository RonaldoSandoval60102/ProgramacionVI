package concreteProduct;
import product.SpotifyAPI;

public class SpotifyAPIImpl  implements SpotifyAPI{

    private String songName;

    public SpotifyAPIImpl(String songName){
        this.songName = songName;
    }
    
    @Override
    public String playSong(String songName) {
        return "Play song" + songName;
    }
    

    @Override
    public String toString(){
        return "[" + songName + "]";
    }

}
