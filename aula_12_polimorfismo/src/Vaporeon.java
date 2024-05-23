public class Vaporeon extends Eevee{
    
    // Atributo
    private String type;

    // Contrutor
    public Vaporeon() {

    }
    
    public Vaporeon(String type, double weight, double height, int hp) {
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
        return "Water Gun";
    }

    @Override
    public String Defense() {
        return "Aqua Tail";
    }

    @Override
    public String Special() {
        return "Hidro Pump";
    }

    @Override
    public void dataSheet() {
        System.out.println("---------- Vaporeon ----------");
        System.out.println("Type: " + getType());
        System.out.printf("Weight: %.2f Kg\n", getWeight());
        System.out.printf("Height: %.2f m\n", getHeight());
        System.out.println("HP: " + getHp());
        System.out.println("------------------------------");
        System.out.println("Attack: " + Attack());
        System.out.println("Special: " + Special());
        System.out.println("Defense: " + Defense());
        System.out.println("------------------------------\n\n");
    }
}
