package fizzbuzz.service;

public class FizzbuzzService {
    public String guessNunber(int i) {
        StringBuilder result = new StringBuilder();
        if (isRelatedTo(i, 3)) {
            result.append("fizz");
        }
        if (isRelatedTo(i, 5)) {
            result.append("buzz");
        }

        return result.length() == 0 ? String.valueOf(i) : result.toString();
    }

    private static boolean isRelatedTo(int i, int x) {
        return i % x == 0 || String.valueOf(i).contains(String.valueOf(x));
    }

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println(i + " : " + new FizzbuzzService().guessNunber(i));
        }
    }
}
