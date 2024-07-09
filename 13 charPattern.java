 import java.util.Scanner;
 class charPattern{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        char c=input.next().charAt(0);
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
                
            }
            System.out.println();
            
        }
        
    }
}

OUTPUT:
B
5

B
BB
BBB
BBBB
BBBBB



