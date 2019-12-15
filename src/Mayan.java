class Mayan extends Language {
    Mayan(String langName, int speakers) {
        super(langName, speakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in" + regionsSpoken + "."
                + " The language follows the word order: " + wordOrder + "Fun fact: " + name
                + " is an ergative language.");
    }

}