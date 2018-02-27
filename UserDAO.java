package DAO;

/**
 * Created by jasontd on 2/15/18.
 */

import models.User;
import models.requests.RegisterRequest;

/**DAO for the User class
 *
 */

public class UserDAO {

    /**
     * This method creates a new user account from a given RegisterRequest object.
     *
     * @param u the user to create an account for
     * @return a User tied to a new account
     */
    public RegisterRequest createAccount(RegisterRequest u) {

        return u;
    }

    /**
     * This method generates a positive number of generations of ancestor data for a given user
     *
     * @param u the user for which to generate ancestor data
     * @param generations the number of generations of ancestor data to be generated
     * @return the User object with newly generated ancestor data
     */
    public User generateAncestor(User u, int generations) {
        return u;
    }

    /**
     * Checks valid username conditions.
     * @param username username to check
     * @return false if username is not already registered with the server, else true
     */
    public boolean checkUsername(String username){
        return false;
    }

    /**
     * Accesses a User object using a given username
     * @param username username referencing a User object
     * @return related User object
     */
    public User getUser_username(String username){
        return null;
    }

    /**
     * Accesses a User object using a given email address
     * @param email email address referencing a User object
     * @return related User object
     */
    public User getUser_email(String email){
        return null;
    }

    /**
     * Accesses a User object using a given username
     * @param firstName first name referencing a User object
     * @param firstName last name referencing a User object
     * @return related User object containing matching first and last name
     */
    public User getUser_firstlast(String firstName, String lastName){
        return null;
    }


    /**
     * gets the username of a given User object
     * @param u the User object
     * @return the User's username
     */
    public String getUserName(User u){
        return null;
    }

    /**
     * gets the email of a given User object
     * @param u the User object
     * @return the User's email
     */
    public String getEmail(User u){
        return null;
    }

    /**
     * gets the first name of a given User object
     * @param u the User object
     * @return the User's first name
     */
    public String getFirstName(User u){
        return null;
    }

    /**
     * gets the last name of a given User object
     * @param u the User object
     * @return the User's last name
     */
    public String getLastName(User u){
        return null;
    }

    /**
     * gets the gender of a given User object
     * @param u the User object
     * @return the User's gender
     */
    public String getGender(User u){
        return null;
    }

    /**
     * gets the personID of a given User object
     * @param u the User object
     * @return the User's personID
     */
    public String getPersonID(User u){
        return null;
    }





}