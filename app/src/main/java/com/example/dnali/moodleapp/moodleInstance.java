package com.example.dnali.moodleapp;

import MoodleDemo.Moodle;

/**
 * Created by shahaf on 06/05/16.
 */
public class moodleInstance {
    private static Moodle moodleinstance;

    public static Moodle getInstance(){
        return moodleinstance;
    }

    public static void setInstance(Moodle m) {
        moodleinstance = m;
    }

}
