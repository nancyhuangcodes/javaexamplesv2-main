package variables;

public class LocalUserProfile {

    public static void main(String[] args) {

        UserProfile localUserProfile = new UserProfile();
        localUserProfile.name = "John Doe";
        localUserProfile.age = 18;

        System.out.println(localUserProfile.name);
        System.out.println(localUserProfile.age);
    }
}
