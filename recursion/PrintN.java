public class PrintN{
    static int cnt =0;
    public static void main(String[] args){
print();
    }
private static void print(){
    if(cnt == 10){
        return;
    }
     System.out.println(cnt);
    cnt++;
    print();
}

}