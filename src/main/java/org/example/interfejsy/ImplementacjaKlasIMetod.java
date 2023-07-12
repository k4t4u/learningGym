package org.example.interfejsy;

public class ImplementacjaKlasIMetod {

    public static void main(String[] args) {

    }

    public class Dog implements CanMove, CanEat {

        public void move() {
        }

        public void eat() {
        }
    }

    public class Cat implements CanMove, CanEat, Edible {

        public void move() {
        }

        public void beEaten() {
        }

        public void eat() {
        }
    }

    public class Mouse implements CanMove, Edible {

        public void move() {
        }

        public void beEaten() {
        }
    }

    // Potrafi się poruszać
    public interface CanMove {
        void move();
    }

    // Może zostać zjedzony
    public interface Edible {
        void beEaten();
    }

    // Potrafi jeść
    public interface CanEat {
        void eat();
    }
}
