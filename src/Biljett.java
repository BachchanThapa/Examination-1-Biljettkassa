public abstract class Biljett {
    private final String biljett;
    private final int grundpris;
    private int rabatt;

    // We count the tickets created because our cinema has 50 seats.
    private static int antalBiljetter = 0;
    private final int biljettId;

    // Business rules: maximum cinema capacity and allowed discount.
    private static final int MAX_BILJETTER = 50;
    private static final int MAX_RABATT = 50;

    public Biljett(String biljett, int grundpris) {
        this.biljett = biljett;
        this.grundpris = grundpris;
        this.rabatt = 0; // Initially there's no discount

        antalBiljetter++;
        this.biljettId = antalBiljetter;
    }

    // Since the fields are private, we use getters to access their values from outside the class.
    public String getBiljett() {
        return biljett;
    }

    public int getGrundpris() {
        return grundpris;
    }

    // Getter - Read the discount
    public int getRabatt() {
        return rabatt;
    }

    // Setter - Changes the discount only if the value is valid.
    // If the value is invalid, the previous discount remains unchanged.
    public void setRabatt(int rabatt) {
        if (rabatt >= 0 && rabatt <= MAX_RABATT) {
            this.rabatt = rabatt;
        } else {
            System.out.println("Ogiltig rabatt! Ange 0-50%.");
        }
    }

    public int getBiljettId() {
        return biljettId;
    }

    // Static getter - Returns the total number of tickets. created across all ticket objects.
    public static int getAntalBiljetter() {
        return antalBiljetter;
    }

    public abstract void visaBiljett();
}
