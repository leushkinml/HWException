public class Main {
    public static void main(String[] args) {
        boolean success = Data.validateParameters("leushkinml", "526958", "526958");
        if (success) {
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");
        }
    }
}