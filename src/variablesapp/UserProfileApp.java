package variablesapp;

import variables.GENDER_TYPE;
import variables.UserProfile;

public class UserProfileApp {

    public static void main(String[] args) {

        UserProfile user = new UserProfile("John Doe", 18, GENDER_TYPE.MALE, "Developer", "Singaporean", "O");

        System.out.println("Name of User: " + user.getName());
        System.out.println("Gender of User: " + user.getGender());

        user.setName("John Smith");     // (NOT ALLOWED) >> user.name = "John Smith";

        System.out.println("Name of User: " + user.getName());
        System.out.println("Gender of User: " + user.getGender());
    }
}