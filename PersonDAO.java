package DAO;

import models.Person;

/**DAO for the Person class
 *
 */

public class PersonDAO {

    /**
     * Checks valid username conditions
     * @param generations string to check
     * @return false if generations is not a positive non-zero int, else true
     */
    public boolean checkGenerations(String generations){
        return false;
    }

    /**
     * This method deletes all Person data assoicated with the given user
     *
     * @param username the user for which to generate ancestor data
     */
    public void deletePerson(String username) {
    }

    /**
     * This method adds a given Person object to the database
     *
     * @param p a given Person object
     */
    public void add(Person p) {
    }

    /**
     * Accesses a Person object from its String ID, if it exists
     * @param id String id referencing a Person object
     * @return related Person object
     */
    public Person getPerson(String id){
        return null;
    }

    /**
     * Accesses a Person object using a given first name
     * @param firstName String id referencing a Person object
     * @return related Person object
     */
    public Person getPerson_firstname(String firstName){
        return null;
    }

    /**
     * Accesses a Person object using a given first name
     * @param lastName String id referencing a Person object
     * @return related Person object
     */
    public Person getPerson_lastname(String lastName){
        return null;
    }
}