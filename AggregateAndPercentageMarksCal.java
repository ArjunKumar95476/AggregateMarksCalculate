import java.util.Scanner;

public class AggregateAndPercentageMarksCal {
        public static void CalculateMarks()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("\n\n===>> AGGREGATE AND PERCENTAGE MARKS CALCULATION OF A STUDENT IN FIVE SUBJECT <<===\n\n");
            System.out.println("SUBJECTS ARE : \n\nMATHEMATICS \nPHYSICS \nCHEMISTRY \nENGLISH \nHINDI\n\n");
            float mathematics;
            float physics;
            float chemistry;
            float english;
            float hindi;
            float aggregate_marks;
            float percentage_marks;
            byte repeat_value;
            do
            {
            System.out.print("MATHEMATICS MARKS : ");
            mathematics=scanner.nextFloat();
            System.out.print("PHYSICS MARKS : ");
            physics=scanner.nextFloat();
            System.out.print("CHEMISTRY MARKS :");
            chemistry=scanner.nextFloat();
            System.out.print("ENGLISH MARKS : ");
            english=scanner.nextFloat();
            System.out.print("HINDI MARKS : ");
            hindi=scanner.nextFloat();
            aggregate_marks=mathematics+physics+chemistry+english+hindi;
            percentage_marks=aggregate_marks/5;
            System.out.println("AGGREGATE MARKS : "+aggregate_marks);
            System.out.println("PERCENTAGE MARKS : "+percentage_marks+"\n\n");
            System.out.println("DO YOU WANT TO CONTINUE THIS PROGRAM THEN PRESS 1 ELSE PRESS 0 !!!");
            repeat_value=scanner.nextByte();
            System.out.println("\n");
            }while(repeat_value!=0);
            System.out.println("THANKS !!\nPROGRAM END !!");
        }
        public static void main(String[] args) {
           CalculateMarks();
        }
    }
    
