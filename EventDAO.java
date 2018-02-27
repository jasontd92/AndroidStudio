package DAO;

import models.Event;

/**DAO for the Event class
 *
 */


public class EventDAO {

    /**
     * This method deletes all Event data associated with given Event
     *
     * @param Eventname the Event for which to generate ancestor data
     */
    public void deleteEvent(String Eventname) {
    }

    /**
     * This method adds a given Event object to the database
     *
     * @param e a given Event object
     */
    public void add(Event e) {
    }

    /**
     * Accesses a Event object from its String ID, if it exists
     * @param id String id referencing a Event object
     * @return related Event object
     */
    public Event getEvent(String id){
        return null;
    }

    /**
     * Accesses the Event object(s) associated with a personID
     * @param id a given personID
     * @return an array of Event objects
     */
    public Event[] getEvent_personID(String id){
        return null;
    }

    /**
     * Accesses the Event object(s) associated with a given year
     * @param year a given year
     * @return an array of Event objects
     */
    public Event[] getEvent_year(String year){
        return null;
    }

    /**
     * Accesses the Event object(s) associated with a given city
     * @param city a given year
     * @return an array of Event objects
     */
    public Event[] getEvent_city(String city){
        return null;
    }

    /**
     * Accesses the Event object(s) associated with a given country
     * @param country a given year
     * @return an array of Event objects
     */
    public Event[] getEvent_country(String country){
        return null;
    }

    /**
     * gets the evntID of a given Event object
     * @param e the Event object
     * @return the Event's eventID
     */
    public String getEventID(Event e){
        return null;
    }

    /**
     * gets the descendant_username of a given Event object
     * @param e the Event object
     * @return the Event's descendant_username
     */
    public String getDescendantUsername(Event e){
        return null;
    }


    /**
     * gets the latitude of a given Event object
     * @param e the Event object
     * @return the Event's latitude
     */
    public double getLatitude(Event e){
        return 0;
    }

    /**
     * gets the longitude of a given Event object
     * @param e the Event object
     * @return the Event's longitude
     */
    public double getLongitude(Event e){
        return 0;
    }

    /**
     * gets the personID of a given Event object
     * @param e the Event object
     * @return the Event's personID
     */
    public String getPersonID(Event e){
        return null;
    }

    /**
     * gets the country of a given Event object
     * @param e the Event object
     * @return the Event's country
     */
    public String getCountry(Event e){
        return null;
    }

    /**
     * gets the city of a given Event object
     * @param e the Event object
     * @return the Event's city
     */
    public String getCity(Event e){
        return null;
    }

    /**
     * gets the event type of a given Event object
     * @param e the Event object
     * @return the Event's event type
     */
    public String getEventType(Event e){
        return null;
    }

    /**
     * gets the year of a given Event object
     * @param e the Event object
     * @return the Event's year, in String form
     */
    public String getYear(Event e){
        return null;
    }
}
