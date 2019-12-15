class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String langName, int speakers, String regions, String wdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + "."
                + " The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea",
                "subject-verb-object");
        spanish.getInfo();
        Language chontal = new Mayan("Chontal", 36810);
        chontal.getInfo();
        Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 920000000);
        Language burmese = new SinoTibetan("Burmese", 33000000);
        mandarinChinese.getInfo();
        burmese.getInfo();

    }
}