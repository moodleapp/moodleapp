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

    public Assignment() {
        this.id = "ed369c1bbdd3c528b70d2c9c8f875ce3";
        this.name = "HW1";
        this.coursename = "Calculus II";
        this.dueDate = new Date(1463004000);
        this.attachedFiles = null;
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
