public class RandomGenerator {

    private long x;
    final private long n = 2147483647;
    private  double y;

    public RandomGenerator(long seed) {
        x = seed;
    }

    public int nextInt() {
        x = ((48271 * x) % n);
        return (int)x;
    }

    public int nextInt(int i) {
        return 3;
    }

    public double nextDouble() {
        y = x / n;
        return y;
    }
}
