import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int sum=a+b+c+d;
        int ans=sum;
        if(sum>10000){
            int dis=(10*sum)/100;
            ans=ans-dis;
        }
        System.out.println(ans);
        
    }
}