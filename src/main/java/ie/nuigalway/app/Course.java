/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.app;

import org.joda.time.DateTime;
import java.util.ArrayList;
/**
 *
 * @author Eddie
 */
public class Course {
    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    DateTime startDate;
    DateTime endDate;
    
    public Course(String name, DateTime startDate, DateTime endDate){
        this.courseName=name;
        this.startDate=startDate;
        this.endDate=endDate;
        this.modules = new ArrayList();
        this.students=new ArrayList();
    }
    public void addModule(Module module){
        modules.add(module);
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
}
