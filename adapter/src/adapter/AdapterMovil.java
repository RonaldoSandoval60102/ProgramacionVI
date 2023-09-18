package adapter;

import adaptee.Mobile;
import target.Device;

public class AdapterMovil implements Device{
    
    private Mobile movil;

    public AdapterMovil(Mobile movil) {
        this.movil = movil;
    }

    @Override
    public void up() {
        System.out.println(movil.MobileVolumeUp());
    }

    @Override
    public void down() {
        System.out.println(movil.MobileVolumeDown());
    }

    public Mobile getMovil() {
        return movil;
    }

}
