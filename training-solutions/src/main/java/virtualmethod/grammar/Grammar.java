package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {
        Verb firstVerb = new PhrasalVerb("hoz", "létre");
        System.out.println(firstVerb.getWord());

        Verb secondVerb = new PhrasalVerbWithSuffix("hoz", "létre", "ás");
        System.out.println(secondVerb.getWord());

        Preposition firstPreposition = new PhrasalVerb("hoz", "létre");
        System.out.println(firstPreposition.getPreposition());
        System.out.println(firstPreposition.getWholeWord());

        Preposition secondPreposition = new PhrasalVerbWithSuffix("hoz", "létre", "ás");
        System.out.println(secondPreposition.getPreposition());
        System.out.println(secondPreposition.getWholeWord());

        PhrasalVerb firstPhrasalVerb = new PhrasalVerb("hoz", "létre");
        System.out.println(firstPhrasalVerb.getWord());
        System.out.println(firstPhrasalVerb.getPreposition());
        System.out.println(firstPhrasalVerb.getWholeWord());

        PhrasalVerb secondPhrasalVerb = new PhrasalVerbWithSuffix("hoz", "létre", "ás");
        System.out.println(secondPhrasalVerb.getWord());
        System.out.println(secondPhrasalVerb.getPreposition());
        System.out.println(secondPhrasalVerb.getWholeWord());

        Suffix suffix = new PhrasalVerbWithSuffix("hoz", "létre", "ás");
        System.out.println(suffix.getSuffix());

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("hoz", "létre", "ás");
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}
