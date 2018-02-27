package models;

/**
 * User object
 */

public class User {

    /**
     * Unique user name (non-empty string)
     */
    private String username;

    /**
     * User's password (non-empty string)
     */
    private String password;

    /**
     * User's email address (non-empty string)
     */
    private String email;

    /**
     * User's first name (non-empty string)
     */
    private String first_name;

    /**
     * User's last name (non-empty string)
     */
    private String last_name;

    /**
     * User's gender (string: "f"||"m")
     */
    private String gender;

    /**
     * Unique Person ID assigned to this user's generated
     * Person object (non-empty string)
     */
    private String person_ID;
}
