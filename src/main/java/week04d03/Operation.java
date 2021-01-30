package week04d03;

public class Operation {

    private String assignment;

    public Operation(String assignment) {

        this.assignment = assignment;
    }

    public int getResult(String string){

        String[] assignmentParts = string.split("\\+");
        int leftOperand;
        int rightOperand;

       leftOperand = Integer.parseInt(assignmentParts[0]);
       rightOperand = Integer.parseInt(assignmentParts[1]);

       return leftOperand + rightOperand;

    }
}
