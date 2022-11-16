public class ServerNameGenerator {
    String[] adjectives = {"purple", "creative", "honest", "authentic", "joyful", "frightened",
            "grieving", "desperate", "magnificent", "omnipotent", "funky"};
    String[] nouns = {"humans", "kitten", "rocket", "banananas", "lamp", "music",
            "love", "bacterium", "liar", "desperation"};

    private static int getRandomNumber(int max){
        return (int) (Math.random() * max);
    }
    public static String returnRandomElement(String[] arr){
        int arrLength = arr.length;
        int randIndex = getRandomNumber(arrLength);
        return arr[randIndex];
    }

    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
        String output = returnRandomElement(sng.adjectives) + "-" + returnRandomElement(sng.nouns);
        System.out.println("Server Name: ");
        System.out.println("output = " + output);
    }
}
