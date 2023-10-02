package chicken;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 80;
    }
    public String getDescription() {
        return "I'm chicken from Belarus. I give 80 eggs per month";
    }
}
