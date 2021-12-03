public class Main {

    public static void main (String[] args) {
        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain tarrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new SwampDecorator(new ForestDecorator(new Plain()));

        System.out.println("Swamp hilll cost " + terrain2.fuelCost());
        System.out.println("Swamp forest hill cost " + terrain3.fuelCost());
    }
}
