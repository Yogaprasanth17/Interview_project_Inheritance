package MathDSA;

public class Hcf {
    public static void main(String[] args){
        int x = 24, y = 36; // o/p = 12
        System.out.print(hcfNum(x,y));
    }
    static int hcfNum(int a,int b) {
        int hcf = 0;
        for(int i=1;i<=a && i<=b;i++) {
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        return hcf;
    }
}
