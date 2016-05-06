package Moodle;

import java.util.*;
import org.json.JSONObject;

/**
 * Created by Rom Cyncynatus on 06/05/2016.
 */
public class Course {

    private String name;
    private List<Assignment> assignments;


    public Course(JSONObject course) {
        this.update(course);
    }

    public void update(JSONObject course) {
        this.setName("TODO");
        this.setAssignments(course);
    }

    public List<Assignment> getAssignments() {
        return this.assignments;
    }

    public void setAssignments(JSONObject course) {
        // TODO implement
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
