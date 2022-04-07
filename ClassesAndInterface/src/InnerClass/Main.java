package InnerClass;

public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren =new Gearbox(6);
//        Gearbox.Gear first=mcLaren.new Gear(1,12.3);
////        Gearbox.Gear sec= new Gearbox.Gear(5,5.2);it gives an error
////        Gearbox.Gear third= new mcLaren.Gear(2,21);it also gives an error
//        System.out.println(first.driveSpeed(1000));

        mcLaren.addGear(1,2.2);
        mcLaren.addGear(2,2.8);
        mcLaren.addGear(3,3.4);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(2000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));

        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(4000));


    }
}
