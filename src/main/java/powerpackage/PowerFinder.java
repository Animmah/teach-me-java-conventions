package powerpackage;

public class PowerFinder {
    public static void main(String[] args) {
        System.out.println(of(1,1));
        System.out.println(of(2,2));
        System.out.println(of(3,2));
        System.out.println(of(2,1));
    }
    public static int of(int x,int y){
        int res=1;
        for(int i=0;i<y;i++){
            res*=x;
        }
        return res;
    }
}
