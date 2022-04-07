package InnerClass;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
//    private int gearNumber; for maintaining the abstraction &
//    removing the confusion while creating the inner class
    private int currentGear;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears=new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in){
        this.clutchIsIn=in;
    }

    public void addGear(int number,double ratio){
        if((number>0)&&(number<=maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear>0)&&(newGear<this.gears.size())){
            this.currentGear=newGear;
            System.out.println("Gear "+newGear+" selected.");
        }else{
            System.out.println("Grind!");
            this.currentGear=0;
        }
    }

    public double wheelSpeed(int rev){
        if(clutchIsIn){
            System.out.println("Scream!");
            return 0.0;
        }
        else{
            return rev*gears.get(currentGear).getRatio();
        }
    }

    //creating an inner class
    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;//accessing from Gear class not from Gearbox
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int rev){
            return rev*(this.ratio);
        }
    }


}
