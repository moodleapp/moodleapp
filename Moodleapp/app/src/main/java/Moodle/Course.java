package Moodle;

import java.util.*;
import org.json.JSONObject;

/**
 * Created by Rom Cyncynatus on 06/05/2016.
 */
public class Course {

    private String name;
    private List<Assignment> assignments;

    public Course(String name, List<Assignment> assignments) {
        this.update(name, assignments);
    }

    private void update(String name, List<Assignment> assignments) {
        this.setName(name);
        this.setAssignments(assignments);
    }

    public List<Assignment> getAssignments() {
        return this.assignments;
    }

    private void setAssignments(List<Assignment> assignments) {
        // TODO implement
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
