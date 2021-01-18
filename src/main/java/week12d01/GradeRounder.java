package week12d01;

import java.util.Arrays;

public class GradeRounder {


  public  int[] roundGrades(int[] grades){
      if (grades == null){
          throw new NullPointerException("Invalid parameter!");
      }

      int[] roundedGrades =  new int[grades.length];

      for (int i = 0; i < grades.length; i++){
          if (grades[i] < 0  || grades[i] > 100) {
              throw new IllegalArgumentException("Invalid parameter!");
          }
          else if (grades[i] < 40 || grades[i] % 5 < 3){
              roundedGrades[i] = grades[i];
          }
          else {
              roundedGrades[i] = (int)(Math.round(grades[i] / 5.0) * 5);
          }
      }
      return roundedGrades;
  }

    public static void main(String[] args) {
      int[] grades;
      grades = new int[] {38,39,43,46,51,58};
      int[] roundedGrades = new GradeRounder().roundGrades(grades);

        System.out.println(Arrays.toString(roundedGrades));

    }
}
