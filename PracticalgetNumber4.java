public class PracticalgetNumber4 {

    // Convert Decimal to Binary
    public String toBinary(int num) {
        return Integer.toBinaryString(num);
    }

    // Convert Decimal to Hexadecimal
    public String toHexadecimal(int num) {
        return Integer.toHexString(num);
    }

    // Convert Decimal to Octal
    public String toOctal(int num) {
        return Integer.toOctalString(num);
    }

    // Main method to return result based on the type
    public String getNumber(int num, String type) {
        if (type.equalsIgnoreCase("binary")) return "Binary: " + toBinary(num);
        if (type.equalsIgnoreCase("hexadecimal")) return "Hexadecimal: " + toHexadecimal(num);
        if (type.equalsIgnoreCase("octal")) return "Octal: " + toOctal(num);
        return "Decimal: " + num; // Default to Decimal
    }
}PracticalgetNumber4 converter = new PracticalgetNumber4();

// Convert number 100 to different formats
System.out.println(converter.getNumber(100, "binary"));      // Binary: 1100100
System.out.println(converter.getNumber(100, "hexadecimal")); // Hexadecimal: 64
System.out.println(converter.getNumber(100, "octal"));       // Octal: 144
System.out.println(converter.getNumber(100, "decimal"));     // Decimal: 100

