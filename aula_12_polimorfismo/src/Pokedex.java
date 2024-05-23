public class Pokedex {
    public static void main(String[] args) throws Exception {
        // Objetos
        Eevee eevee = new Eevee("Normal", 6.5, 0.3, 127);
        Vaporeon vaporeon = new Vaporeon("Water", 29, 1, 230);
        Jolteon jolteon = new Jolteon("Eletric", 24.5, 0.8, 140);
        Floreon floreon = new Floreon("Fire", 25, 0.9, 140);
        Espeon espeon = new Espeon("Psychic", 26.5, 0.89, 140);
        Umbreon umbreon = new Umbreon("Dark", 27, 0.99, 182);
        Leafeon leafeon = new Leafeon("Grass", 25.5, 1, 140);
        Glaceon glaceon = new Glaceon("Ice", 25.9, 0.8, 140);
        Sylveon sylveon = new Sylveon("Fairy", 23.5, 1, 182);

        // Imprimindo os dados
        eevee.dataSheet();
        vaporeon.dataSheet();
        jolteon.dataSheet();
        floreon.dataSheet();
        espeon.dataSheet();
        umbreon.dataSheet();
        leafeon.dataSheet();
        glaceon.dataSheet();
        sylveon.dataSheet();
        
    }
}
