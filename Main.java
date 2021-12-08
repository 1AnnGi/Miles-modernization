public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10500;
        int bonusMiles = service.calculate(cost);
        System.out.println(bonusMiles);
    }
}
