import java.util.random.RandomGenerator;

class RandomGeneratorEx {
    public static void main(String[] args) {
        String name="...";
        System.out.println(RandomGenerator.of(name));
        System.out.println(RandomGenerator.StreamableGenerator.of(name));
        System.out.println(RandomGenerator.SplittableGenerator.of(name));
        
    }
}
