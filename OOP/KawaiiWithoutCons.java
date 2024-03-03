package OOP;

class KawaiiWithoutCons {
    private String name = "default name";
    private String species = "unknown";

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
        KawaiiWithoutCons furiren = new KawaiiWithoutCons();
        furiren.setSpecis("sprite");
        furiren.setName("Furiren");
        System.out.println("Today, I met kawaii " + furiren.getName() + ", and her specis " + furiren.getSpecies());
    }
}
