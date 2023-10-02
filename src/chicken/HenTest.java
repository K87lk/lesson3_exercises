package chicken;

public class HenTest {
    public static void main(String[] args) {
        HenFactory henFactory = new HenFactory();
        Hen hen = henFactory.getHen("Russia");
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
    }
}
