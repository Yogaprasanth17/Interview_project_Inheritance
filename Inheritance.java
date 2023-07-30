import java.util.*;
        // Creating class for rouund2
class round2{
    // Initializing integer and string array and integers
    String[] name;
    int[] mark;
    int c;
    int avg;

   public round2(String[] name,int[] mark,int c,int avg)
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
        // entry2 class is the child of round2 class
class entry2 extends round2{
       // Creating the constructor for entry2 class 
   public entry2(String[] name,int[] mark,int c,int avg)
   {
       // super keyword used to call the parent class constructor 
       super(name,mark,c,avg);
   }
}

class round1{
        // Initializing integer and string array and integers   
    String[] name;  
    int[] mark;
    int n;
    int avg;
        // Creating the constructor for round1 class
    public round1(String[] name,int[] mark,int n,int avg){
        this.name=name;
        this.mark=mark;     // this keyword is used to initialize the variable with same name
        this.n=n;
        this.avg=avg;
        int c=0;            // Initialized the variable as zero to get the new count of candedates 
            System.out.println();
                // Statement for round one shortlists 
            System.out.println("The below candidates are shortlisted for \"INTERVIEW-Round One\":: ");
                // Evaluate the array-mark with the average mark 
            for(int i=0;i<n;i++)
            {
               if(mark[i]>=avg)
               {
                   System.out.println("Name: "+name[i]+"\n"+"Mark: "+mark[i]+"\n");     // Print the name and for of the candedates 
                   System.out.println();
                   this.name[c]=name[i];        // Initializing the elements to the same variable 
                   c++;                         // Overriding the array with new count
               }
            }
            Scanner sc = new Scanner(System.in);    // Creating the object for scanner class
                // Read the new marks from the user
            System.out.println("Enter the evaluation score for \"INTERVIEW-Round Two\":: ");
            for(int i=0;i<c;i++)
            {
                System.out.print("Name: "+name[i]+"\n"+"Mark: ");
                System.out.println();
                mark[i]=sc.nextInt();
            }
                // Read the new average mark 
         /*  System.out.println();
         *  System.out.print("Enter the \"Round Two\" average mark:: ");
         *  avg=sc.nextInt();
         */
                // Creating a object for entry2 class
            entry2 entry2 = new entry2(name,mark,c,avg); 
    }
}

            // entry class is a child of round1 class
class entry extends round1{
            // Creating a constructor for entry class
    public entry(String[] name,int[] mark,int n,int avg)
    {
            // Calling the parent class constructor 
        super(name,mark,n,avg);
    }
}

public class Inheritance{
            // Creating a constructor for inheritance class 
    public Inheritance()
    {
            // Creating a object for Scanner class to read
        Scanner sc = new Scanner(System.in);  
            // Read the integer form the user
        System.out.print("Enter the number of candidates attending the interview:: "); 
        int n = sc.nextInt(); 
        System.out.println();
            // Read the average score from the user
        System.out.print("Enter the \"Base Evaluation Score\" to clear the interview:: ");
        int avg = sc.nextInt();
        System.out.println();
            // Initializing array and string array
        int[] mark  = new int[n];
        String[] name = new String[n];
            // Reading the string and integer for "n" time form user
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the \"Name\" of the candidate- "+(i+1));
            name[i] = sc.next(); 
            System.out.println("Enter the \"Evaluation Score\" of the candidate- "+(i+1));
            mark[i] = sc.nextInt();
            System.out.println();
        }
            // Creating the object for entry class  
        entry entry = new entry(name,mark,n,avg);
    }
    public static void main(String[] args)
    {
            // Creating the object for inheritance class
        Inheritance inheritance = new Inheritance();
    }
}