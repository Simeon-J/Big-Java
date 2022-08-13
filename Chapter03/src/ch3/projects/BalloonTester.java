package ch3.projects;

public class BalloonTester {
    public static void main(String[] args) {
        Balloon ball = new Balloon();
        ball.inflate(2.0);
        String ball2 = ball.toString();
        System.out.println(ball2);
    }
}
