package io.ravitej.ui.tests.driver;
/**
 * Created by ravit on 05/12/2016.
 */
public interface DriverSession {
        void start(String url);
        void deleteAllCookies();
        void dispose();
}