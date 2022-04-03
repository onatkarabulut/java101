import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double total = 0.0;
        for (int i : numbers){
            total+=1/i;
        }
        System.out.println("Dizi : \n"+ Arrays.toString(numbers ));
        System.out.println("Dizinin Harmonik Ortalaması : " + numbers.length/total  );
    }
}
