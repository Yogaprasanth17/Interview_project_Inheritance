public class BinaryToDecimal {
    public static void main(String[] args) {
        int num = 11;
        int bin = decimalToBinary(num);
        System.out.println("Binary number of "+num+" is "+bin);
        int ans = binaryToDecimal(bin);
        System.out.println("Decimal convertion of "+bin+" is "+ans);
    }
    static int binaryToDecimal(int bin) {
        int ans = 0,c = 0;
        while (bin != 0) {
            int r = bin % 10;
            ans += r * Math.pow(2,c);
            bin /= 10;
            c++;
        }
        return ans;
    }
    static int decimalToBinary(int num) {
        int ans = 0;
        int[] bin = new int[1001];
        int c = 0;
        while (num != 0) {
            bin[c++] = num % 2;
            num /= 2;
        }
        for (int i=c-1;i>=0;i--) {
            ans  = (ans * 10) + bin[i];
        }
        return ans;
    }
}
