package DAO;

import models.AuthToken;

/**
 * DAO for the AuthToken class
 */

public class AuthTokenDAO {

    /**
     * This method deletes the AuthToken associated with the given user
     *
     * @param username the user for which to generate ancestor data
     */
    public void deleteAuthToken(String username) {
    }

    /**
     * This method adds a given AuthToken object to the database
     *
     * @param a a given AuthToken object
     */
    public void add(AuthToken a) {
    }

    /**
     * Accesses the AuthToken object associated with a given username
     * @param username a given username
     * @return the associated AuthToken object
     */
    public AuthToken getAuthToken_username(String username){
        return null;
    }

    /**
     * Accesses the AuthToken object associated with a given auth token
     * @param at a given authtoken
     * @return the associated AuthToken object
     */
    public AuthToken getAuthToken_authoken(String at){
        return null;
    }
}
