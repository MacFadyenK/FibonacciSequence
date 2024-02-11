public class App {

    //computes the fibonacci sequence and prints the number in sequence
    //corresponding to the index parameter
    //parameters num1 and num2 are the numbers the sequence starts on
    //corresponding to index number 0 and 1
    public static void fibonacci(int num1, int num2, int index){
        if(index<=0){
            System.out.print(num1);
            return;
        }
        fibonacci(num2, num1+num2, --index);

    }
    public static void main(String[] args) throws Exception {
        try {
            int index = Integer.parseInt(args[0]);
            if(index<0){
                System.out.println("Index must be a non negative integer.");
            }else{
                fibonacci(0, 1, index);
            }
        } catch (Exception e) {
            System.out.println("Index must be a non negative integer.");
        }
    }
}
