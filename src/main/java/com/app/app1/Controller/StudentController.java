package com.app.app1.Controller;

import com.app.app1.Model.Student;
import com.app.app1.Repository.StudentRepository;
import com.app.app1.Service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data
@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //build create employee REST API
    @PostMapping("/add")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    //build GET employee REST API
    @GetMapping("/getall")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    //build Get Employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") int id){
        return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
    }


    //Update Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") int id, @RequestBody Student student){
        return new ResponseEntity<Student>(studentService.updateStudent(student,id), HttpStatus.OK);

    }

    //Build Delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int id){

        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student Deleted Successfully!", HttpStatus.OK);
    }


/*
private StudentRepository studentRepository;
    @PostMapping("/addstu")
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        studentRepository.save(student);
        return ResponseEntity.ok("student record is saved");
    }
    @PostMapping("/addlist")
    public ResponseEntity<String> createStudents(@RequestBody List<Student> studentList){
        studentRepository.saveAll(studentList);
        return ResponseEntity.ok("All students are saved");
    }

    @GetMapping("/getcus")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    @DeleteMapping
    public void deleteStudentById(int id){
        studentRepository.delete(id);
    }*/

}

