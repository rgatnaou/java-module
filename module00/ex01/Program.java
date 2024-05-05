import java.util.Scanner;  // Import the Scanner class

public class Program{
    private static String primeString(int nb)
    {
        int i = 2;
        int sqrt = (int) Math.sqrt(nb);
        while (i <= sqrt)
        {
         if (nb % i == 0)
            return "false " + (i - 1);
            i++;
        }
        return "true " + (i - 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            
            try{
                String check = scanner.next();

                int nb = Integer.parseInt(check);               
                if(nb < 1)
                {
                    System.out.println("IllegalArgument");
                    scanner.close();
                    System.exit(-1);
                }else
                System.out.println(primeString(nb));
            }catch(Exception e){
                System.err.println("input Invalid");
            }
        }
    }
    
} 