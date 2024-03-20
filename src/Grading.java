public class Grading {

    public static void main(String[] args){

        System.out.println(roundMarks(87));

    }

   public static int roundMarks(int marks){

        if(marks > 37 && marks % 5 >= 3){
            marks += 5 - (marks % 5);
        } else {
            System.out.println("No rounding needed");
        }
        return marks;
    }

}
