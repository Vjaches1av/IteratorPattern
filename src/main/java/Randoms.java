import java.util.Date;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min, max;
    protected Random random;

    public Randoms(int min, int max) {
        this.random = new Random(new Date().getTime());
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max + 1 - min) + min;
            }
        };
    }
}
