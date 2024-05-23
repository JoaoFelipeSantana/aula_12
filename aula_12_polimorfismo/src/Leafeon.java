public class Leafeon extends Eevee{
    @Override
    public String Attack() {
        return "Quick Attack";
    }

    @Override
    public String Defense() {
        return "Bullet Speed";
    }

    @Override
    public String Special() {
        return "Solar Beam";
    }

    @Override
    public void dataSheet() {
        System.out.println("---------- Leafeon ----------");
        System.out.println("Type: " + getType());
        System.out.printf("Weight: %.2f\n", getWeight());
        System.out.printf("Height: %.2f\n", getHeight());
        System.out.println("HP: " + getHp());
        System.out.println("-------------------------------");
        System.out.println("Attack: " + Attack());
        System.out.println("Special: " + Special());
        System.out.println("Defense: " + Defense());
        System.out.println("-------------------------------");
    }
}
