package sk.tuke.register;

/**
 * register.Person.
 */
public class Person {
    /**
     * Name of this person.
     */
    private String name;

    /**
     * Phone number of this person.
     */
    private String phoneNumber;

    /**
     * Construct a person.
     *
     * @param name        name of the person
     * @param phoneNumber phone number of the person
     */
    public Person(String name, String phoneNumber) {
        this.name = name;
        this.setPhoneNumber(phoneNumber);
    }

    /**
     * Returns name of this person.
     *
     * @return name of this person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of this person.
     *
     * @param nameNew name of this person
     */
    public void setName(String nameNew) {
        name = nameNew;
    }

    /**
     * Returns phone number of this person.
     *
     * @return phone number of this person
     */
    public String getPhoneNumber(String phoneNumber) {
        return this.phoneNumber;
    }

    /**
     * Sets phone number of this person.
     *
     * @param phoneNumberNew phone number of this person
     */
    public void setPhoneNumber(String phoneNumberNew) {
        if (!isValidPhoneNumber(phoneNumberNew)) {
            throw new IllegalArgumentException("Phone number is not valid");
        }
        phoneNumber = phoneNumberNew;
    }

    //TODO: Implement method isValidPhoneNumber

    /**
     * Validates the phone number. Valid phone numbers contains only digits.
     *
     * @param phoneNumber phone number to validate
     * @return <code>true</code> if phone number is valid, <code>false</code> otherwise
     */
    private boolean isValidPhoneNumber(String phoneNumber) {
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (Character.isDigit((phoneNumber.charAt(i)))) {
                return true;
            } else  {
                return false;
            }
        }

    }


    /**
     * Returns a string representation of the person.
     *
     * @return string representation of the person.
     */
    public String toString() {
        return name + " (" + phoneNumber + ")";
    }
}
