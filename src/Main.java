public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 28789;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Miles for purchased ticket");
        System.out.println(miles + " " + "Miles");
    }
}