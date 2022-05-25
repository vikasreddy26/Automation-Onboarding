package Oops.Home;

import java.util.ArrayList;
import java.util.Collections;

public class PowerConsumption extends Appliances {

    public PowerConsumption(int fan, int light, int tv, int laptop) {

        super(fan, light, tv, laptop);
    }

    public void powerConsumeOnSwitchOn(boolean fan, boolean light, boolean tv, boolean laptop) {
        int powerConsumption;
        if (fan && laptop && tv && light) {
            powerConsumption = this.fan + this.laptop + this.tv + this.light;
        } else if (fan && !light && !tv  && !laptop) {
            powerConsumption = this.fan;
        } else if (light && !fan  && !tv  && !laptop ) {
            powerConsumption = this.light;
        } else if (tv && !fan && !light && !laptop ) {
            powerConsumption = this.tv;
        } else if (laptop && !fan  && !light && !tv ) {
            powerConsumption = this.laptop;
        } else if (fan && light && !tv  && !laptop ) {
            powerConsumption = this.fan + this.light;
        } else if (fan && tv && !light && !laptop) {
            powerConsumption = this.fan + this.tv;
        } else if (fan && laptop && !tv && !light) {
            powerConsumption = this.fan + this.laptop;
        } else if (light && tv && !fan  && !laptop) {
            powerConsumption = this.light + this.tv;
        } else if (light && laptop && !fan  && !tv ) {
            powerConsumption = this.light + this.laptop;
        } else if (tv && laptop && !fan  && !light ) {
            powerConsumption = this.tv + this.laptop;
        } else if (light && fan && tv && !laptop) {
            powerConsumption = this.fan + this.tv + this.light;
        } else if (light && fan && !tv  && laptop) {
            powerConsumption = this.fan + this.laptop + this.light;
        } else if (light && !fan  && tv && laptop) {
            powerConsumption = this.laptop + this.tv + this.light;
        } else if (!light  && fan && tv && laptop) {
            powerConsumption = this.laptop + this.tv + this.fan;
        } else {
            powerConsumption = 0;
        }
        System.out.println("Power Consumption Of Given Load is :: " + powerConsumption + "Units");

    }

    public static void main(String[] args) {
        PowerConsumption powerConsumption = new PowerConsumption(1,2,4,3);
        PowerConsumption powerConsumption1 = new PowerConsumption(5,8,10,5);
        PowerConsumption powerConsumption2 = new PowerConsumption(4,6,15,8);
        PowerConsumption powerConsumption3 = new PowerConsumption(3,5,12,8);
        ArrayList<PowerConsumption> list = new ArrayList<PowerConsumption>();
        list.add(powerConsumption);
        list.add(powerConsumption1);
        list.add(powerConsumption2);
        list.add(powerConsumption3);
        System.out.println("Before Sorting : "+list);
        Collections.sort(list);
        System.out.println("After Sorting : "+list);
        powerConsumption.powerConsumeOnSwitchOn(false,true,false,true);
    }


}
