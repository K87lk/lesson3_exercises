package chicken;

public class HenFactory {

    public Hen getHen(String country) {
        if(country == null) return null;
        if(country.equalsIgnoreCase("Russia")) return new RussianHen();
        if(country.equalsIgnoreCase("Ukraine")) return new UkrainianHen();
        if(country.equalsIgnoreCase("Moldova")) return new MoldovanHen();
        if(country.equalsIgnoreCase("Belarus")) return new BelarusianHen();
        return null;
    }

}
