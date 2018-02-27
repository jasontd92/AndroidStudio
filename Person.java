package models;

/**
 * Person object.
 */

public class Person {

    /**
     *Unique identifier for this person (non-empty string)
     */
    private String person_ID;

    /**
     *User (Username string) to which this person belongs
     */
    private String descendant_username;

    /**
     *Person's first name (non-empty string)
     */
    private String first_name;

    /**
     *Person's last name (non-empty string)
     */
    private String last_name;

    /**
     *Person's gender (string: "f" ||"m:)
     */
    private String gender;

    /**
     *ID of Person's Father
     */
    private String father_ID;

    /**
     *ID of Person's Mother
     */
    private String mother_ID;

    /**
     *ID of Person's Spouse
     */
    private String spouse_ID;
}
