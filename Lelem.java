
public class Lelem {
    public static void main(String[] args) {
        int data[] = { 10,20,30,40,50,79};
        int L = data.length;
        int first = 0;
        int second = 0;
        for(int i = 0; i<L;i++){
            if(data[i]>first){
            second = first;
            first = data[i];
            }
            else if(data[i]>second){
                second = data[i];
            }

        }
        System.out.println(second);
    }
}
