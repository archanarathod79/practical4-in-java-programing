public class PracticalGetByte4 {
    // Method to convert integer to byte
    public byte getByte(int num) {
        byte ans;
        // Using modulo operation to convert the number within byte range (-128 to 127)
        ans = (byte)(num % 256);  // Taking the remainder after dividing by 256
        return ans;
    }

    public static void main(String[] args) {
        PracticalGetByte4 obj = new PracticalGetByte4();
        
        // Test cases
        int[] testNumbers = {1000, -1000, 128, -128, 200, -200};
        
        for (int num : testNumbers) {
            System.out.println("Byte value for " + num + ": " + obj.getByte(num));
        }
    }
}
