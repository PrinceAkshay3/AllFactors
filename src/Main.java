// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        printFactors(12);
    }
    public static void printFactors(int number){

        if(number < 1){
            System.out.println("Invalid Value");
        }else{
            for(int i=1;i<=number;i++){
                if(number % i == 0){
                    System.out.println(i);
                }
            }
        }

    }
}
