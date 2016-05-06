package Moodle;

import java.util.*;
import org.json.JSONObject;

/**
 * Created by Rom Cyncynatus on 06/05/2016.
 */
public class Assignment {
    private String id;
    private String name;
    private String coursename;
    private Date dueDate;
    private List<AttachedFile> attachedFiles;

    public Assignment(String id, String name, String coursename, int dueDate, List<AttachedFile> attachedFiles) {
        this.update(id, name, coursename, dueDate, attachedFiles);
    }

    private void update(String id, String name, String coursename, int dueDate, List<AttachedFile> attachedFiles) {
        this.id = id;
        this.name = name;
        this.coursename = coursename;
        this.dueDate = new Date(dueDate);
        this.attachedFiles = new ArrayList<>(attachedFiles);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public List<AttachedFile> getAttachedFiles() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void setAttachedFiles(List<AttachedFile> attachedFiles) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
