import java.util.Scanner;
 class factors{
    public static void main(String args[]){
        Scanner input  = new Scanner(System.in);
        int n=input.nextInt();
        int factors=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            factors=factors+1;
        }
        System.out.print("Number of factors = "+factors);
       
}
}

OUTPUT:
10
Number of factors = 4


