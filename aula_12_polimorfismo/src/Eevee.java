public class Eevee {
    
    // Atributos
    String type;
    double weight;
    double height;
    int hp;

    // Contrutor
    public Eevee() {

    }

    public Eevee(String type, double weight, double height, int hp) {
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.hp = hp;
    }

    public Eevee(double weight, double height, int hp) {
        this.weight = weight;
        this.height = height;
        this.hp = hp;
    }

    // Métodos acessores
    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getHp() {
        return hp;
    }    

    // Métodos modificadores
    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // Métodos
    public String Attack() {
        return "Quick Attack";
    }

    public String Defense() {
        return "Dodge";
    }

    public String Special() {
        return "Tri_attack";
    }

    public void dataSheet() {
        System.out.println("---------- Eevee ----------");
        System.out.println("Type: " + getType());
        System.out.printf("Weight: %.2f\n", getWeight());
        System.out.printf("Height: %.2f\n", getHeight());
        System.out.println("HP: " + getHp());
        System.out.println("---------------------------");
        System.out.println("Attack: " + Attack());
        System.out.println("Special: " + Special());
        System.out.println("Defense: " + Defense());
        System.out.println("---------------------------");
    }
    
}
