public class PracticalString4 {

    // Convert Decimal to Binary, Hex, and Octal (positive and negative)
    public String convert(int num, String type) {
        StringBuilder result = new StringBuilder();
        int base = type.equalsIgnoreCase("binary") ? 2 : type.equalsIgnoreCase("hex") ? 16 : 8;
        while (num != 0) {
            result.insert(0, (base == 16 && num % base >= 10) ? (char)('a' + num % base - 10) : num % base);
            num /= base;
        }
        return result.length() == 0 ? "0" : result.toString();
    }

    // Convert Binary, Hex, Octal to Decimal (positive and negative)
    public int stringToDecimal(String num, String type) {
        int base = type.equalsIgnoreCase("binary") ? 2 : type.equalsIgnoreCase("hex") ? 16 : 8;
        return Integer.parseInt(num, base);
    }

    // Convert Negative Binary, Hex, Octal to Decimal
    public int negativeStringToDecimal(String num, String type) {
        return -stringToDecimal(num, type);
    }
}PracticalString4 converter = new PracticalString4();

// Positive Decimal to Binary, Hex, and Octal
System.out.println(converter.convert(100, "binary"));  // Binary: 1100100
System.out.println(converter.convert(100, "hex"));     // Hexadecimal: 64
System.out.println(converter.convert(100, "octal"));   // Octal: 144

// Negative Decimal to Binary, Hex, and Octal
System.out.println(converter.convert(-100, "binary"));  // Binary: 1100100 (negative)
System.out.println(converter.convert(-100, "hex"));     // Hexadecimal: 64 (negative)
System.out.println(converter.convert(-100, "octal"));   // Octal: 144 (negative)

// Convert Strings back to Decimal
System.out.println(converter.stringToDecimal("1100100", "binary"));  // Decimal from Binary: 100
System.out.println(converter.stringToDecimal("64", "hex"));          // Decimal from Hex: 100
System.out.println(converter.stringToDecimal("144", "octal"));       // Decimal from Octal: 100

// Negative Conversions from Strings to Decimal
System.out.println(converter.negativeStringToDecimal("1100100", "binary"));  // Negative Decimal from Binary: -100
System.out.println(converter.negativeStringToDecimal("64", "hex"));          // Negative Decimal from Hex: -100
System.out.println(converter.negativeStringToDecimal("144", "octal"));       // Negative Decimal from Octal: -100

