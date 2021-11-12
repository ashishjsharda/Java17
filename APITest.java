public class APITest {
    public static void main(String[] args) {
        Double d=10.0;
        synchronized (d){
            System.out.println(d);
        }
    }
}
