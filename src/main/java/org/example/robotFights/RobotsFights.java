package org.example.robotFights;

/* 
Walki robotów
*/

public class RobotsFights {
    public static void main(String[] args) {
        Robot amigo = new Robot("Amigo");
        Robot enemy = new Robot("Wróg");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(Robot robotFirst, Robot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defend();
        System.out.println(String.format("%s zaatakował %s: zaatakowano jego %s i zdołano obronić jego %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}
