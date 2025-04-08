public class Sum {

    public static void main(String[] args) {
        System.out.println(sum(2034));
    }

    static int sum(int x){
        if (x == 0)
            return 0;

        return (x % 10) + sum(x/10);
    }
}