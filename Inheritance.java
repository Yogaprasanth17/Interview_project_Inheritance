import java.util.*;

class round2{
    String[] name;
    int[] mark;
    int c;
    int avg;
    round2(String[] name,int[] mark,int c,int avg)
    {
        this.name=name;
        this.mark=mark;
        this.c=c;
        this.avg=avg;
       
            System.out.println("The below candidates \"has cleared the-INTERVIEW\":: ");
            for(int i=0;i<c;i++)
            {
               if(mark[i]>=avg)
               {
                   System.out.println("Name: "+name[i]+"\n"+"Mark: "+mark[i]+"\n");
                   System.out.println();
               }
            }
    }
}

class entry2 extends round2{
   public entry2(String[] name,int[] mark,int c,int avg)
   {
       super(name,mark,c,avg);
   }
}

class round1{
    String[] name;
    int[] mark;
    int n;
    int avg;
    public round1(String[] name,int[] mark,int n,int avg){
        this.name=name;
        this.mark=mark;
        this.n=n;
        this.avg=avg;
        int c=0;
            System.out.println();
            System.out.println("The below candidates are shortlisted for \"INTERVIEW-Round One\":: ");
            for(int i=0;i<n;i++)
            {
               if(mark[i]>=avg)
               {
                   System.out.println("Name: "+name[i]+"\n"+"Mark: "+mark[i]+"\n");
                   System.out.println();
                   this.name[c]=name[i];
                   c++;
               }
            }
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the evaluation score for \"INTERVIEW-Round Two\":: ");
            for(int i=0;i<c;i++)
            {
                System.out.print("Name: "+name[i]+"\n"+"Mark: ");
                mark[i]=sc.nextInt();
            }
            //System.out.println();
            // System.out.print("Enter the \"Round Two\" average mark:: ");
            // avg=sc.nextInt();
            entry2 e2 = new entry2(name,mark,c,avg); 
    }
}


class entry extends round1{
    
    public entry(String[] name,int[] mark,int n,int avg)
    {
        super(name,mark,n,avg);
    }
}

public class Inheritance{
    public Inheritance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of candidates attending the interview:: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Enter the \"Base Evaluation Score\" to clear the interview:: ");
        int avg = sc.nextInt();
        System.out.println();
        int[] mark  = new int[n];
        
        String[] name = new String[n];
      
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the \"Name\" of the candidate- "+(i+1));
            name[i] = sc.next(); 
            System.out.println("Enter the \"Evaluation Score\" of the canditate- "+(i+1));
            mark[i] = sc.nextInt();
            System.out.println();
        }
       
        entry ent = new entry(name,mark,n,avg);
    }
    public static void main(String[] args)
    {
        Inheritance main = new Inheritance();
    }
}