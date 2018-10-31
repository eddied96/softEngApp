/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.app;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Eddie
 */
public class ModuleTest extends TestCase {
    
    public ModuleTest(String testName) {
        super(testName);
    }

    /**
     * Test of addCourse method, of class Module.
     */
    public void testAddCourse() {
        System.out.println("addCourse");
        Course course = null;
        Module instance = null;
        instance.addCourse(course);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudent method, of class Module.
     */
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = null;
        Module instance = null;
        instance.addStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModuleId method, of class Module.
     */
    public void testGetModuleId() {
        System.out.println("getModuleId");
        Module instance = null;
        String expResult = "";
        String result = instance.getModuleId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModuleId method, of class Module.
     */
    public void testSetModuleId() {
        System.out.println("setModuleId");
        String moduleId = "";
        Module instance = null;
        instance.setModuleId(moduleId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModuleName method, of class Module.
     */
    public void testGetModuleName() {
        System.out.println("getModuleName");
        Module instance = null;
        String expResult = "";
        String result = instance.getModuleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModuleName method, of class Module.
     */
    public void testSetModuleName() {
        System.out.println("setModuleName");
        String moduleName = "";
        Module instance = null;
        instance.setModuleName(moduleName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourses method, of class Module.
     */
    public void testGetCourses() {
        System.out.println("getCourses");
        Module instance = null;
        ArrayList<Course> expResult = null;
        ArrayList<Course> result = instance.getCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourses method, of class Module.
     */
    public void testSetCourses() {
        System.out.println("setCourses");
        ArrayList<Course> courses = null;
        Module instance = null;
        instance.setCourses(courses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class Module.
     */
    public void testGetStudents() {
        System.out.println("getStudents");
        Module instance = null;
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudents method, of class Module.
     */
    public void testSetStudents() {
        System.out.println("setStudents");
        ArrayList<Student> students = null;
        Module instance = null;
        instance.setStudents(students);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
