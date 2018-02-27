package models;

/**
 * Event object
 */

public class Event {

    /**
     *  Unique identifier for this event (non-empty string)
     */
    private String event_ID;

    /**
     *  User (Username) to which this person belongs
     */
    private String descendant_username;

    /**
     *  ID of person to which this event belongs
     */
    private String person_ID;

    /**
     *  Latitude of events location
     */
    private double latitude;

    /**
     *  Longitude of events location
     */
    private double longitude;

    /**
     *  Country in which event occured
     */
    private String country;

    /**
     *  City in which event occured
     */
    private String city;

    /**
     * Type of event (birth, baptism, christening, marriage, death, etc.)
     */
    private String event_type;

    /**
     * Year in which event occurred
     */
    private int year;
}
