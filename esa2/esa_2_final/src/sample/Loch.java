package sample;

// Klasse Loch
// abstrahiert das Loch auf dem Spielbrett mit einem bestimmten Punktwert

public class Loch {

    private int punktwert;
    private Boolean istGetroffen = false;


    public Loch(int punktwert) {
        this.punktwert = punktwert;
    }

    public Boolean getIstGetroffen() {
        return this.istGetroffen;
    }

    public void setIstGetroffen(boolean getroffen) {
        this.istGetroffen = getroffen;
    }

    public int getPunktwert() {
        return this.punktwert;
    }

}