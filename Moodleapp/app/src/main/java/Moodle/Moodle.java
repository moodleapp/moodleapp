package Moodle;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Rom Cyncynatus on 06/05/2016.
 */
public class Moodle {

    // Fields will go here

    public void Login(String username, String password) {

    }

    public void Logout() {

    }

    public List<Course> getCousrses() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public List<Assignment> getAllAssignments() {
        List<Assignment> assigns = new LinkedList<>();

        assigns.add(new Assignment());
        assigns.add(new Assignment());
        assigns.add(new Assignment());

        return assigns;
    }
}
