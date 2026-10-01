public class Max{
  public static void main(String[] args) {
        int[] numbers = {12, 25, 8, 40, 17};
        int max=numbers[0];
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);
            
    }
}