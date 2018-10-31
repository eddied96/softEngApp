/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.app;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author Eddie
 */
public class CourseTest extends TestCase {
    
    public CourseTest(String testName) {
        super(testName);
    }

    /**
     * Test of addModule method, of class Course.
     */
    public void testAddModule() {
        System.out.println("addModule");
        Module module = new Module("testModule", "test01");
        Course instance = new Course("Arts", DateTime.parse("07/01/2018", DateTimeFormat.forPattern("dd/mm/yyyy")), DateTime.parse("07/12/2022", DateTimeFormat.forPattern("dd/mm/yyyy")));
        instance.addModule(module);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(module,instance.getModules().get(0));
    }

    /**
     * Test of addStudent method, of class Course.
     */
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = null;
        Course instance = null;
        instance.addStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Course instance = null;
        String expResult = "";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "";
        Course instance = null;
        instance.setCourseName(courseName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModules method, of class Course.
     */
    public void testGetModules() {
        System.out.println("getModules");
        Course instance = null;
        ArrayList<Module> expResult = null;
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModules method, of class Course.
     */
    public void testSetModules() {
        System.out.println("setModules");
        ArrayList<Module> modules = null;
        Course instance = null;
        instance.setModules(modules);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class Course.
     */
    public void testGetStudents() {
        System.out.println("getStudents");
        Course instance = null;
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudents method, of class Course.
     */
    public void testSetStudents() {
        System.out.println("setStudents");
        ArrayList<Student> students = null;
        Course instance = null;
        instance.setStudents(students);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class Course.
     */
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Course instance = null;
        DateTime expResult = null;
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class Course.
     */
    public void testSetStartDate() {
        System.out.println("setStartDate");
        DateTime startDate = null;
        Course instance = null;
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class Course.
     */
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Course instance = null;
        DateTime expResult = null;
        DateTime result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class Course.
     */
    public void testSetEndDate() {
        System.out.println("setEndDate");
        DateTime endDate = null;
        Course instance = null;
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
