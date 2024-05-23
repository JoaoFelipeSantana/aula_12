public class Umbreon extends Eevee{
    public String Attack() {
        return "Feint Attack";
    }

    public String Defense() {
        return "Snarl";
    }

    public String Special() {
        return "Dark Pulse";
    }

    public void dataSheet() {
        System.out.println("---------- Umbreon ----------");
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
