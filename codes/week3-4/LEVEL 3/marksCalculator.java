import java.util.Scanner;
class marksCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phymark, chemmark, mathsmark,total;
        double average;
        System.out.println("Enter Physics, Chemistry and Maths Marks: ");
        phymark=sc.nextInt();
        chemmark=sc.nextInt();
        mathsmark=sc.nextInt();
        total=phymark+chemmark+mathsmark;
        average=total/3;
        if(average>=80){
            System.out.println("Grade: A");
            System.out.println("Remark: Level 4, above agency normalized standards");
        }
        else if(average>=70){
            System.out.println("Grade: B");
            System.out.println("Remark: Level 3, at agency normalized standards");
        }
        else if(average>=60){
            System.out.println("Grade: C");
            System.out.println("Remark: Level 2, below, but approaching agency normalized standards");
        }
        else if(average>=50){
            System.out.println("Grade: D");
            System.out.println("Remark: Level 1, well below agency normalized standards");
        }
        else if(average>=40){
            System.out.println("Grade: E");
            System.out.println("Remark: Level 1, too below normalized standards");
        }
        else if(average>=70){
            System.out.println("Grade: R");
            System.out.println("Remark: Remedial standards");
        }
    }
}