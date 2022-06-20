/*********************************************************************************
 * This class gets the following 3 parameters from the user: 
 * 1) the exam grade
 * 2) the average grade of the homework assignments that he submitted
 * 3) the number of homework assignments that were submitted
 * and calculates the final grade of a student in a course
 * according to a given formula
 ********************************************************************************/
import java.util.Scanner;
public class Grades
{
    public static void main(String args[])
    { 
        // declaration of variables and constants
        final int PASS=55;
        final int GOOD_HOMEWORK_AVERAGE=8;
        final double WEIGHT_OF_5_6_ASSIGNMENTS=.20;
        final double WEIGHT_OF_7_8_ASSIGNMENTS_IF_PASSED=.30;
        final double WEIGHT_OF_7_8_ASSIGNMENTS_IF_FAILED_GOOD_AVERAGE=.25;
        final double WEIGHT_OF_7_8_ASSIGNMENTS_IF_FAILED_NOT_GOOD_AVERAGE=.20;
        int examGrade, numberOfAssignments, homeworkAverage;
        double finalGrade;
        Scanner scan=new Scanner(System.in);

        // getting data from user
        System.out.println("Please enter the exam grade:");
        examGrade=scan.nextInt();
        System.out.println("Please enter the homework average:");
        homeworkAverage=scan.nextInt();
        homeworkAverage*=10;
        System.out.println("Please enter the number of assignments handed in:");
        numberOfAssignments=scan.nextInt();
        finalGrade=examGrade;

        if(numberOfAssignments<=4){
            finalGrade=0;
        }
        else if(numberOfAssignments<=6 && examGrade>=PASS)
        { 
            finalGrade=examGrade*(1- WEIGHT_OF_5_6_ASSIGNMENTS); 
            finalGrade+= homeworkAverage* WEIGHT_OF_5_6_ASSIGNMENTS;
        }
        else if(numberOfAssignments>=7)
        { // the number of assignments the student submitted is >=7
            //…see next slide;

            switch(numberOfAssignments)
            {
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: finalGrade=0; 
                    break;

                case 5: 
                case 6: if(numberOfAssignments<=6)
                        {
                            if(examGrade>=PASS)
                            { 
                            finalGrade=examGrade*(1- WEIGHT_OF_5_6_ASSIGNMENTS); 
                            finalGrade+= homeworkAverage* WEIGHT_OF_5_6_ASSIGNMENTS;
                            }
                        } 
                    break;

                case 7: 
                case 8: if(homeworkAverage>examGrade)// the homework average grade must “protect" the student
                        { 
                            if ( examGrade>=PASS)
                            {
                            finalGrade=examGrade*(1- WEIGHT_OF_7_8_ASSIGNMENTS_IF_PASSED); 
                            finalGrade+=homeworkAverage* WEIGHT_OF_7_8_ASSIGNMENTS_IF_PASSED; 
                            } 
                            else{ // the exam grade is less than PASS (54)
                                if((homeworkAverage/10)>=GOOD_HOMEWORK_AVERAGE){ //homeworkAverage>=8
                                finalGrade=examGrade*(1-WEIGHT_OF_7_8_ASSIGNMENTS_IF_FAILED_GOOD_AVERAGE); 
                                finalGrade+= homeworkAverage*WEIGHT_OF_7_8_ASSIGNMENTS_IF_FAILED_GOOD_AVERAGE;
                                }
                                else{ // the homework average of the student is less than 8
                                finalGrade=examGrade*(1-WEIGHT_OF_7_8_ASSIGNMENTS_IF_FAILED_NOT_GOOD_AVERAGE);
                                finalGrade+= homeworkAverage*WEIGHT_OF_7_8_ASSIGNMENTS_IF_FAILED_NOT_GOOD_AVERAGE;
                                }
                            } // the student didn’t pass the exam
                        } // the homework average is higher than the exam grade
                    System.out.println("Your final grade is: "+finalGrade); 
            }// end of main method // end of Grade class
        }
    }
}
