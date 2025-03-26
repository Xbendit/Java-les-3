public class ApplePieRecipe {

    Ingredient a1 = new Ingredient (200, "gram", "ongezouten roomboater");
    Ingredient a2 = new Ingredient (200, "gram", "witte basterd suiker");
    Ingredient a3 = new Ingredient (400, "gram", "zelfrijzend bakmeel");
    Ingredient a4 = new Ingredient (1, "stuk(s)", "ei");
    Ingredient a5 = new Ingredient (8, "gram", "vanillesuiker");
    Ingredient a6 = new Ingredient (1, "snuf", "zout");
    Ingredient a7 = new Ingredient (1.5, "kilo", "appels");
    Ingredient a8 = new Ingredient (75, "gram", "kristal suiker");
    Ingredient a9 = new Ingredient (3, "theelepels", "kaneel");
    Ingredient a10 = new Ingredient (15, "gram", "parneermeel");

    public void voorverwarmen () {
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public void klopei () {
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }
    public void mengdeeg () {
        System.out.println("3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public void snijappels() {
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public void vetbankvorm() {
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem.");
    }
    public void bekleedvorm() {
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public void voegappels() {
        System.out.println("7. Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public void snijstroken() {
        System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public void legstroken() {
        System.out.println("9. Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }
    public void zetoven() {
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printIngredients() {
        System.out.println(a1.getAmount() + " " + a1.getUnit() + " " + a1.getName());
        System.out.println(a2.getAmount() + " " + a2.getUnit() + " " + a2.getName());
        System.out.println(a3.getAmount() + " " + a3.getUnit() + " " + a3.getName());
        System.out.println(a4.getAmount() + " " + a4.getUnit() + " " + a4.getName());
        System.out.println(a5.getAmount() + " " + a5.getUnit() + " " + a5.getName());
        System.out.println(a6.getAmount() + " " + a6.getUnit() + " " + a6.getName());
        System.out.println(a7.getAmount() + " " + a7.getUnit() + " " + a7.getName());
        System.out.println(a8.getAmount() + " " + a8.getUnit() + " " + a8.getName());
        System.out.println(a9.getAmount() + " " + a9.getUnit() + " " + a9.getName());
        System.out.println(a10.getAmount() + " " + a10.getUnit() + " " + a10.getName());
    }

    public void printstappen() {
        zetoven();
        legstroken();
        snijstroken();
    }
}
