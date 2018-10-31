/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.app;
import java.util.ArrayList;
/**
 *
 * @author Eddie
 */
public class Module {
    private String moduleName;
    private String moduleId;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    
    public Module(String name, String moduleId){
        this.moduleName=name;
        this.moduleId=moduleId;
        this.courses=new ArrayList();
        this.students=new ArrayList();
    }
    public void addCourse(Course course){
    courses.add(course);
    }
    public void addStudent(Student student){
    students.add(student);
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
}
