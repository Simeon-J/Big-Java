package ch3.projects;

/**
 * A class representation of a person
 */
public class Person {
    public String name;
    public String friends;
    public int friendCount;

    /**
     * Creates a person with a name and no friends
     * @param name name of person
     */
    public Person(String name) {
        this.name = name;
        this.friends = "";
        this.friendCount = 0;
    }

    /**
     * Adds a persons name to this person's friend list
     * @param p name of person to add to list
     */
    public void befriend(Person p) {
        this.friends = this.friends.concat(p.name + " ");
        friendCount++;
    }

    /**
     * takes a person's name off of this person's friend list
     * @param p name of person to subtract from list
     */
    public void unfriend(Person p) {
        this.friends = friends.replace(p.name+" ","");
        friendCount--;
    }

    /**
     * Returns list of friends
     * @return String of friends
     */
    public String getFriendNames() {
        return friends;
    }

    /**
     * Returns amount of friends person has
     * @return number of friends
     */
    public int getFriendCount() {
        return friendCount;
    }
}
