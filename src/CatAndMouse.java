public class CatAndMouse {
    public static void main(String[] args) {
        // X = posição gato a
        // Y = posição gato b
        // Z = posição rato
        System.out.println(catAndMouse(2,5,4));
    }

    static String catAndMouse(int x, int y, int z) {

        int distanceCatXFromMouse = x - z;
        int distanceCatYFromMouse = y - z;

        if (Math.abs(distanceCatXFromMouse) < Math.abs(distanceCatYFromMouse)) {
            return "Cat A";
        } else if (Math.abs(distanceCatXFromMouse) > Math.abs(distanceCatYFromMouse)) {
            return "Cat B";
        }
        return "Mouse C";
    }
}
