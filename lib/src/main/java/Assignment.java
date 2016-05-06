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

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCoursename() {
        return coursename;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public List<AttachedFile> getAttachedFiles() {
        return attachedFiles;
    }
}
