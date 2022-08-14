package ch3.projects;

public class PersonTester {
    public static void main(String[] args) {
        Person John = new Person("John");
        Person Mary = new Person("Mary");
        Person Bob = new Person("Bob");
        Person Susan = new Person("Susan");

        John.befriend(Mary);
        John.befriend(Bob);
        John.befriend(Susan);
        System.out.println(John.name);
        System.out.println(John.friendCount);
        System.out.println(John.getFriendNames());
        John.unfriend(Bob);
        System.out.println(John.getFriendCount());
        System.out.println(John.getFriendNames());
    }
}
