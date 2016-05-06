package Moodle;

import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;
/**
 * Created by Rom Cyncynatus on 06/05/2016.
 */
public class Moodle {

    private static final String LOGIN_URL = "http://moodletest.com/login/token.php?";
    private static final String LOGIN_SERVICE = "moodle_mobile_app";

    private List<Course> courses;
    private boolean signedIn;

    public Moodle() {
        signedIn = false;
    }

    public void Login(String username, String password) throws IOException, JSONException {

        // Build login request URL
        String url = LOGIN_URL;
        url += "username=" + username;
        url += "&password=" + password;
        url += "&service=" + LOGIN_SERVICE;

        JSONObject json = readJsonFromUrl(url);
        System.out.println("TODO REMOVE ME!!! (I AM HERE JUST FOR DEBUGGING)\n" + json.toString(4));

        signedIn = true;
    }

    public void Logout() {
        courses = null;
        signedIn = false;
    }

    public List<Course> getCousrses() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public List<Assignment> getAllAssignments() {
        List<Assignment> assigns = new LinkedList<>();
        for (Course course : courses) {
            assigns.addAll(course.getAssignments());
        }
        return assigns;
    }

    private static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }


    public class JsonReader {

        private String readAll(Reader rd) throws IOException {
            StringBuilder sb = new StringBuilder();
            int cp;
            while ((cp = rd.read()) != -1) {
                sb.append((char) cp);
            }
            return sb.toString();
        }

        public JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
            InputStream is = new URL(url).openStream();
            try {
                BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                String jsonText = readAll(rd);
                JSONObject json = new JSONObject(jsonText);
                return json;
            } finally {
                is.close();
            }
        }
    }
}