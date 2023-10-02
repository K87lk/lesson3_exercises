package chicken;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 50;
    }
    public String getDescription() {
        return "I'm chicken from Russia. I give 50 eggs per month";
    }
}
