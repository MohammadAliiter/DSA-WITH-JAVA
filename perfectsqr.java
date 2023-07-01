public class perfectsqr {
    public static boolean isprefectsqr(int x){
        if(x > 0){
            int sr = (int)Math.sqrt(x);
            return (sr*sr == x);
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 9;
        if(isprefectsqr(num))
        System.out.println("this prefect square");
        else
        System.out.println("this is not prefect square");
    }
}
