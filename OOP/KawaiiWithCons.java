package OOP;

class KawaiiWithCons {
    private String name = "default name";
    private String species = "unknown";

    public KawaiiWithCons(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public KawaiiWithCons(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    public void setSpecis(String species) {
        this.species = species;

    }

    public String getSpecies() {
        System.out.println(this.species);
        return this.species;
    }

    public static void main(String[] args) {
        KawaiiWithCons furiren = new KawaiiWithCons("Furiren");
        System.out.println("Today, I met kawaii " + furiren.getName() + ", and her specis " + furiren.getSpecies());
    }
}
