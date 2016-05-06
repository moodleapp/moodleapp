package Moodle;

import java.util.List;

/**
 * Created by Rom Cyncynatus on 06/05/2016.
 */
public class Moodle {

    private Course[] courses; // all courses
    private boolean signedIn;

    public void Login(String username, String password) {
        if (!signedIn) {
            String URL = "http://moodletest.com/login/token.php?username=" + username + "&password=" + password + "&service=moodle_mobile_app");
            JSONObject json = readJsonFromUrl(URL);

        }
    }

    public void Logout() {
        courses = null;
        signedIn = false;
    }

    public List<Assignment> getAllAssignments() {
        return null;
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
}