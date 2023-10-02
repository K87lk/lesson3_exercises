package musician;

public class Musician {
    private Instrument instrument;

    public Musician() {
    }

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

   public void startPlay() {
        System.out.println("Get ready to play");
        instrument.play();
    }
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
