import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<Student> students;
    private int currentId;

    public StudentManagementSystem(){
        students = new ArrayList<>();
    }

    public void addStudent(String name, String email){
        Student newStudent = new Student(currentId++, name,email);
        students.add(newStudent);
        System.out.println("Öğrenci Başarı İle Eklendi :" + newStudent.toString());

    }

    public void listStudents(){
        if (students.isEmpty()){
            System.out.println("Henüz kayıtlı bir öğrenci yok:");
        }else {
            for (Student student: students){
                System.out.println(student);
            }
        }
    }
    public void updateStudent( int id ,String name, String email){
        for (Student student: students){
            if (student.getId()== id){
                student.setName(name);
                student.setEmail(email);
                System.out.println("Öğrenci Bilgileri Güncellendi:" + student);
                return;
            }
        }

        System.out.println("Öğrenci Bulunamadı!");
    }
    public void deleteStudent(int id){
        for (Student student :students) {
            if (student.getId() ==id){
                students.remove(student);
                System.out.println("Öğrenci Silindi :" + student);
                return;
            }
        }
        System.out.println("Öğrenci Bulunamadı");
    }
}
