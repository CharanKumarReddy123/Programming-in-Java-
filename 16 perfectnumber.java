 import java.util.Scanner;
 class perfect{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int factors=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            factors=factors+i;
            
        }
        if(n==factors){
        System.out.print("It's a perfect number");
        }
        else{
              System.out.print("It's not a perfect number");
        }
    }
}

OUTPUT:
10
It's not a perfect number
