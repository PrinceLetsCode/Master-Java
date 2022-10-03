package CodeChef;


//the question was to replace the "party" word with "pawri"

public class PawriMeme {
    public static void main(String[] args) {
        String nos = "part";
        String s = "partyandparty";

        String newS = nos.replace("party", "pawri");
        String newS1 = s.replace("party", "pawri");
        System.out.println(newS);
        System.out.println(newS1);

    }
}
