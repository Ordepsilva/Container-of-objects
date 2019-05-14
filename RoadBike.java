/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeStore;

import enums.BrakeType;
import enums.Material;

/**
 *
 * @author Pedro
 */
public class RoadBike extends Bicycle {

    private int handlebelt;
    private float frameSize;
    private String obs;

    public RoadBike(int handlebelt, float frameSize, String obs, int id, int numberOfGears, String mainColor, float weelSize, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, BrakeType.H, Material.CARBONO, price, guaranteeYears);

        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.obs = obs;
    }

    public int getHandlebelt() {
        return handlebelt;
    }

    public void setHandlebelt(int handlebelt) {
        this.handlebelt = handlebelt;
    }

    public float getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(float frameSize) {
        this.frameSize = frameSize;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}
