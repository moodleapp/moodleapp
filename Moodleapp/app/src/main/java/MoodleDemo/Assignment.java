package MoodleDemo;


import java.util.Date;
import java.util.List;

/**
 * Created by Rom Cyncynatus on 06/05/2016.
 */
public class Assignment {
    String id;
    String name;
    String coursename;
    Date dueDate;
    List<AttachedFile> attachedFiles;

    public Assignment() {
        this.id = "ed369c1bbdd3c528b70d2c9c8f875ce3";
        this.name = "HW1";
        this.coursename = "Calculus II";
        this.dueDate = new Date(1463004000);
        this.attachedFiles = null;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCoursename() {
        return this.coursename;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public List<AttachedFile> getAttachedFiles() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
