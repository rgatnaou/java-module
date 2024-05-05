public class Program {
    public static int sum(int nb){
        if(nb == 0)
            return 0;
        return nb % 10 + sum(nb / 10);
    }
    public static void main(String[] args){
        int nb = 479598;
        System.out.println(sum(nb));
    }
}