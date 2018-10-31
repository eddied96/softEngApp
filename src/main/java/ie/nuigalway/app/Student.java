/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.app;

/**
 *
 * @author Eddie
 */
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Student {
    private String name;
    private int age;
    private LocalDate dob;
    private int id;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;
    
    public Student(String name, LocalDate dob){
    this.name = name;
    this.dob=dob;
    this.age = findAge();
    this.id=id;
    this.modules=new ArrayList();
    this.courses=new ArrayList();
    this.username=getUsername();
    
    }
    
    public void addCourse(Course course){
        courses.add(course);
    }
    public void addModule(Module module){
        modules.add(module);
    }
    private int findAge() {
        LocalDate currentDate = LocalDate.now();
        this.age = Period.between(dob,currentDate).getYears();
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return age;
    }
    
    public String getUsername() {
        username = name + age;
        return username;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    
}
