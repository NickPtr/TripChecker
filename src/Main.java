
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        int input;
        float input2;
        Odometro od = null;
        do 
        {
            System.out.println("Epiloges");
            System.out.println("1) Enarksi taksidiou");
            System.out.println("2) Midenismos odometrou kai telos ta");
            System.out.println("3) Prosthiki xiliometrwn");
            System.out.println("4) Emfanisi litrwn venzinis pou katanalothikan kai xiliometra pou dianithikan");
            System.out.println("0) Termatismos");
            System.out.print("Dwste epilogi: ");
            Scanner in = new Scanner(System.in);
            input = in.nextInt();
            
            if(input==1)
            {
                System.out.print("Dwste xiliometra: ");
                input = in.nextInt();
                System.out.print("Dwste katanalosi: ");
                input2 = in.nextFloat();
                od=new Odometro(input,input2);
            }
            else if(input==2)
            {
                od.Midenismos();
            }
            else if(input==3)
            {
                System.out.print("Prostheste xiliometra: ");
                input = in.nextInt();
                od.AddXlm(input);
            }
            else if(input==4)
            {
                System.out.println("Exete kanei "+od.getXlm()+" xiliometra kai exete katanalosei "+od.Venzini()+" litra Venzini");
            }
            else if(input==0)
            {
                System.out.println("Bye");
            }
            else
                System.out.println("Lathos epilogi!!");
            
        } while (input != 0);

    }

}
