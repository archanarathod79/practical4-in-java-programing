public class Practicalgetshort4 {
    public Short getShort(int num) {
        short ans;
        int temp = num / 32768;
        
        // Check if the number is within the range of the short type (-32768 to 32767)
        if (num >= -32768 && num <= 32767) {
            ans = (short) num;  // If within range, return the number as a short
        } else if (temp % 2 == 0) {
            ans = (short) (num % 32768);  // Handle positive values
        } else {
            ans = (short) (-32768 + num % 32768);  // Handle negative values with an offset
        }
        return ans;
    }

    public static void main(String[] args) {
        Practicalgetshort4 obj = new Practicalgetshort4();

        // Test individual positive and negative numbers
        int number1 = 100000;
        System.out.println("Short value for " + number1 + ": " + obj.getShort(number1));
        
        int number2 = -100000;
        System.out.println("Short value for " + number2 + ": " + obj.getShort(number2));

        int number3 = 32767;
        System.out.println("Short value for " + number3 + ": " + obj.getShort(number3));

        int number4 = -32768;
        System.out.println("Short value for " + number4 + ": " + obj.getShort(number4));

        int number5 = 123456;
        System.out.println("Short value for " + number5 + ": " + obj.getShort(number5));

        int number6 = -123456;
        System.out.println("Short value for " + number6 + ": " + obj.getShort(number6));
    }
}
