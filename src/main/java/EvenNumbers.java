public class EvenNumbers {
    public static void main(String[] args) {
        int oddCount = 0;
        int evenCount = 0;
        int start = 5;

        while (start<=20 && evenCount<5) {
            if (isEvenNumber(start)) {
                System.out.println("Even number found = " + start);
                evenCount++;
            }
            else {
                oddCount++;
            }
            start++;
        }
        System.out.println("Total number of even numbers found = " + evenCount);
        System.out.println("Total number of odd numbers founds = " + oddCount);
    }
    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
