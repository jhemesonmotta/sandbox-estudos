import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGrades {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();
        notas.add(1);
        notas.add(17);
        notas.add(41);
        notas.add(58);
        notas.add(73);

        System.out.println(gradingStudents(notas).toString());
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        grades = grades.stream().map(studentGrade -> defineStudentGrade(studentGrade)).collect(Collectors.toList());
        return grades;
    }

    public static Integer defineStudentGrade(Integer grade) {
        if (grade < 38) {
            return grade;
        }
        Integer arredondado = 5*(Math.round(grade/5));

        if (arredondado < grade) {
            arredondado =  arredondado + 5;
        }
        if ((arredondado - grade) < 3) {
            grade = arredondado;
        }
        return grade;
    }
}
