package chicken;

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 59;
    }
    public String getDescription() {
        return "I'm chicken from Ukraine. I give 59 eggs per month";
    }
}
