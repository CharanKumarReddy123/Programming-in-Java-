import java.util.Scanner;
class Main{
 public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int first_term=0;
    int second_term=1;
    for (int i=1;i<=n;i++){
        System.out.print(first_term+" ");
        int next_term=first_term+second_term;
        first_term=second_term;
        second_term=next_term;
    }
}
}

OUTPUT:
number:10
Fibbonacci series:  0 1 1 2 3 5 8 13 21 34 
