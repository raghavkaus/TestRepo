`	package OopsConcept;

public class ClasesandObject {

    public void eat() {
        System.out.println("Raghav");
    }

    public static void main(String[] args) {
        System.out.println("1");

        ClasesandObject e2 = new ClasesandObject();
        e2.run();
        e2.eat();

       play g2 =new play();
        g2.play();

        // TODO Auto-generated method stub
    }

    public void run() {
        System.out.println("I am running");
    }

 static   public class play {
        public void play() {
            System.out.println("I am playing");
        }
    }
}
