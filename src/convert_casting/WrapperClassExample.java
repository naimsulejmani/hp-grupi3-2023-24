package convert_casting;

public class WrapperClassExample {
    public static void main(String[] args) {
        String s1 = "123";
        byte byte1 = Byte.parseByte(s1);
        short short1 = Short.parseShort(s1);
        int int1 = Integer.parseInt(s1);
        s1 = "123213213213213";
        long long1 = Long.parseLong(s1);
        s1 = "123.45";
        float float1 = Float.parseFloat(s1);
        double double1 = Double.parseDouble(s1);

        s1 = "false";
        boolean boolean1 = Boolean.parseBoolean(s1);

    }
}















