public class CompareInt {
    int a;
    int b;
    public void Compare(int a, int b){
        this.a = a;
        this.b = b;
        if (a<b) {
            System.out.println(a);
        } else if(a>b){
            System.out.println(b);
        } else{
            System.out.println("두 수가 같습니다");
        }
    }
}
