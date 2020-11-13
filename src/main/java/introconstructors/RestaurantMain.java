package introconstructors;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Aranyfácán", 14);
        restaurant.setMenu("húsleves", "tökfőzelék", "rántott hús","fagylalt");
        System.out.println("Az étterem neve: " + restaurant.getName());
        System.out.println("Az étterem kapacitása: " + restaurant.getCapacity() + " fő");
        System.out.println("A választható ételek: " + restaurant.getMenu());
    }
}
