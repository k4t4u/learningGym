package org.example.methods;



    public class MetodaWitajacaGosciaLubGosci {

        public void sayHi(String...names) {

            for (String name: names) {
                System.out.println("Good evening, " + name + ". How are you?");
            }
        }

        public static void main(String[] args) {
            MetodaWitajacaGosciaLubGosci jarvis = new MetodaWitajacaGosciaLubGosci();
            jarvis.sayHi("Tony Stark", "Captain America", "Black Widow", "Hulk");
        }
    }
