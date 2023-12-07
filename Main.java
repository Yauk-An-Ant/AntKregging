

public class Main {
    public static void main(String[] args) {

        Add add = ((int a, int b) -> {
            int sum = 0;
            for(int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        });
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(add.add(a, b));
    }
}
