package quest_java_oop3;

public class Eagle extends Bird implements Fly {
    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public void takeOff() {
        System.out.println(getName() + " takes off in the sky.");
        flying = true;
    }

    @Override
    public void glide() {
        System.out.println(" glides into the air.");
    }


    @Override
    public void land() {
        if (altitude <= 1) {
            System.out.println(getName() + " lands on the ground.");
            flying = false;
        } else {
            System.out.println(getName() + " is too high, it can't land.");
        }
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 325);
            System.out.printf("%s altitude downward, altitudes : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s altitude upward, altitude :  %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
