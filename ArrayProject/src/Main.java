import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int[] numberList={2,4,6,8};
    System.out.println(sumOfArray(numberList));
    ArrayList<Integer> result =toPower(6,2);
    System.out.print("[");
    for(Integer entry: result){
        System.out.print(entry + ",");
    }
    System.out.print("]");
    }

     public static int sumOfArray(int[] numberList) {
        int sum=0;
        for(int i=0; i<numberList.length;i++){
           sum=numberList[i] + sum;
        };
        return sum;
    };

    public static ArrayList<Integer> toPower(int size, int power){
        ArrayList<Integer> toPowerArray = new ArrayList<Integer>();
        for(int i=0; i<size;i++){
            toPowerArray.add((int)(Math.pow(i,power)));

        }
        return toPowerArray;
    }
}