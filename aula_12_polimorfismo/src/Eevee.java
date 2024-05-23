public class Eevee {
    
    // Atributos
    String type;
    double weight;
    int height;
    int hp;

    // Contrutor
    public Eevee() {

    }

    public Eevee(String type, double weight, int height, int hp) {
        this.type = type;
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

    public int getHeight() {
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
    
}
