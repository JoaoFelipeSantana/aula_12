public class Floreon extends Eevee{
    public String Attack() {
        return "Ember";
    }

    public String Defense() {
        return "Fire Spin";
    }

    public String Special() {
        return "Overheat";
    }

    public void dataSheet() {
        System.out.println("---------- Floreon ----------");
        System.out.println("Type: " + getType());
        System.out.printf("Weight: %.2f\n", getWeight());
        System.out.printf("Height: %.2f\n", getHeight());
        System.out.println("HP: " + getHp());
        System.out.println("-----------------------------");
        System.out.println("Attack: " + Attack());
        System.out.println("Special: " + Special());
        System.out.println("Defense: " + Defense());
        System.out.println("-----------------------------");
    }
}
