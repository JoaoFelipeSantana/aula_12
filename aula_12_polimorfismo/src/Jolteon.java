public class Jolteon extends Eevee{
    // Atributo
    private String type;

    // Contrutor
    public Jolteon() {

    }
    
    public Jolteon(String type, double weight, double height, int hp) {
        super(weight, height, hp);
        this.type = type; 
    }

    // Método acessor
    public String getType() {
        return this.type;
    }

    // Método Modificador
    public void setType(String newType) {
        this.type = newType;
    }
    
    @Override
    public String Attack() {
        return "Thunder Shock";
    }

    @Override
    public String Defense() {
        return "Volt Switch";
    }

    @Override
    public String Special() {
        return "Thunderbolt";
    }

    @Override
    public void dataSheet() {
        System.out.println("---------- Jolteon ----------");
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
