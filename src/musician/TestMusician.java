package musician;

public class TestMusician {
    public static void main(String[] args) {
        Musician musician = new Musician(new Guitar());
        musician.startPlay();
        musician.setInstrument(new Piano());
        musician.startPlay();
    }
}
