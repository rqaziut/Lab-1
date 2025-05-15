public class Multiples {
    public static void main(String[] args) {

        int i = 0;
        while (i < 1000) {

            i = skibidi(i);
        }
        System.out.println(i);

    }

    public static int skibidi(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        i++;
        int count = 0;

        // Print our appropriate result.
        if (divisibleBy3) {

            count++;

        } else if (divisibleBy5) {

            count++;

        } else {

            count += 0;

        }
        return count;
    }
}
