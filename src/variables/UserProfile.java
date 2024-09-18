package variables;
public class UserProfile {

    // TODO - create variables for the following
    String name;                // name (String, private)
    int age;                    // age (int, private)
    GENDER_TYPE gender;         // gender (GENDER_TYPE, private)
    String jobPreference;       // job preference (String, private)
    String nationality;         // nationality (String, private)
    String bloodType;           // blood type (String, private)

    public UserProfile(String name, int age, GENDER_TYPE gender, String jobPreference, String nationality, String bloodType) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobPreference = jobPreference;
        this.nationality = nationality;
        this.bloodType = bloodType;
    }

    public UserProfile() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GENDER_TYPE getGender() {
        return gender;
    }

    public void setGender(GENDER_TYPE gender) {
        this.gender = gender;
    }

    public String getJobPreference() {
        return jobPreference;
    }

    public void setJobPreference(String jobPreference) {
        this.jobPreference = jobPreference;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}