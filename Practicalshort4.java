public class Practicalshort4 { 
    public Short getShort(int num) { 
        short ans; 
        int temp = num / 32768; 
        if (temp % 2 == 0) { 
            ans = (short)(num % 32768); 
        } else { 
            ans = (short)(-32768 + num % 32768); 
        } 
        return ans; 
    } 
    public static void main(String[] args) { 
        Practicalshort4 obj = new Practicalshort4(); 
        int number = 100000; 
        System.out.println("Short value for " + number + ": " + obj.getShort(number)); 
    } 
}
