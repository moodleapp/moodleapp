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

    private Course[] courses; // all courses
   // private boolean signedIn;

    public static void Login(String username, String password)  {
        //signedIn = false;
       // if (!signedIn) {
            String URL = "http://moodletest.com/login/token.php?username=" + username + "&password=" + password + "&service=moodle_mobile_app";
            JSONObject json;
        try {
            json = readJsonFromUrl(URL);
            System.out.println(json.toString(4));
        } catch (java.io.IOException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (org.json.JSONException e) {
            System.out.println("Error : " + e.getMessage());
        }
       // }
    }

    public void Logout() {
        courses = null;
        //signedIn = false;
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

    public static void main(String[] args) {
        Login("nir.levin", "Password1!");
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