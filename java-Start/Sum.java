public class Sum {
    public static void main(String[] args) {
        byte MyByteValue = 127;
        short MyShortValue = 32430;
        int MyIntValue = 12345;
        long MyLongValue = 50_000L+10L*(MyByteValue+MyIntValue+MyShortValue);
        System.out.println(MyLongValue);
    }
}
