package com.app.app1.Service;
import com.app.app1.Exception.ResourceNotFound;
import com.app.app1.Entity.Student;
import com.app.app1.Repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFound("Student","Id",id));
    }

    @Override
    public Student updateStudent(Student student, int id) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFound("Employee","Id",id));
        existingStudent.setAge((student.getAge()));
        existingStudent.setName(student.getName());
        existingStudent.setScore(student.getScore());
        studentRepository.save(existingStudent);
        return existingStudent;
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Employee","Id",id));
        studentRepository.deleteById(id);
    }
}
