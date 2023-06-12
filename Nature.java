package quest_java_oop3;

public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        System.out.printf("\n%s:%n", pingou.getName());
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        System.out.printf("\n%s:%n", hawkeye.getName());

        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glide();
        hawkeye.descend(140);
        hawkeye.land();
        hawkeye.descend(9);
        hawkeye.land();
    }
}
