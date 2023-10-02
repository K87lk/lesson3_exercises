package chicken;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 70;
    }
    public String getDescription() {
        return "I'm chicken from Moldova. I give 70 eggs per month";
    }
}
