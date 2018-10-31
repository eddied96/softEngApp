/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.app;

import java.time.LocalDate;
import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Eddie
 */
public class StudentTest extends TestCase {
    
    public StudentTest(String testName) {
        super(testName);
    }

    /**
     * Test of addCourse method, of class Student.
     */
    public void testAddCourse() {
        System.out.println("addCourse");
        Course course = null;
        Student instance = null;
        instance.addCourse(course);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addModule method, of class Student.
     */
    public void testAddModule() {
        System.out.println("addModule");
        Module module = null;
        Student instance = null;
        instance.addModule(module);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Student.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        Student instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Student.
     */
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Student instance = null;
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDob method, of class Student.
     */
    public void testGetDob() {
        System.out.println("getDob");
        Student instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getDob();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDob method, of class Student.
     */
    public void testSetDob() {
        System.out.println("setDob");
        LocalDate dob = null;
        Student instance = null;
        instance.setDob(dob);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Student.
     */
    public void testGetId() {
        System.out.println("getId");
        Student instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Student.
     */
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Student instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourses method, of class Student.
     */
    public void testGetCourses() {
        System.out.println("getCourses");
        Student instance = null;
        ArrayList<Course> expResult = null;
        ArrayList<Course> result = instance.getCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourses method, of class Student.
     */
    public void testSetCourses() {
        System.out.println("setCourses");
        ArrayList<Course> courses = null;
        Student instance = null;
        instance.setCourses(courses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModules method, of class Student.
     */
    public void testGetModules() {
        System.out.println("getModules");
        Student instance = null;
        ArrayList<Module> expResult = null;
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModules method, of class Student.
     */
    public void testSetModules() {
        System.out.println("setModules");
        ArrayList<Module> modules = null;
        Student instance = null;
        instance.setModules(modules);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
