/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeStore;

import enums.Material;
import enums.MountainBikeSuspension;
import enums.BrakeType;
import bikeStore.Bicycle;

/**
 *
 * @author Pedro
 */
public class MountainBike extends Bicycle {

    /**
     * Número de luzes
     */
    private int numberOfLights;
    /**
     * Tipo de suspensão
     */
    private MountainBikeSuspension suspension;
    /**
     * Utensílios existentes neste tipo de bicicleta
     */
    private BikeTools[] bikeTools;

    /**
     * Método construtor para a criação de uma instância de
     * {@link MountainBike bicicleta de montanha} sem utensílios.
     *
     * @param numberOfLights Número de luzes
     * @param suspension Tipo de suspensão
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guarantee Anos de garantia
     */
    public MountainBike(int numberOfLights, MountainBikeSuspension suspension,
            int id, int numberOfGears, String mainColor, float weelSize,
            BrakeType brakes, Material material, float price, int guarantee) {
        super(id, numberOfGears, mainColor, weelSize, brakes, material,
                price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;

    }

    public MountainBike(int numberOfLights, MountainBikeSuspension suspension, BikeTools[] bikeTools, int id, int numberOfGears, String mainColor, float weelSize, BrakeType brakes, Material material, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, brakes, material, price, guaranteeYears);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;

        for (int i = 0; i < bikeTools.length; i++) {
            if (i < 10) {
                this.bikeTools[i] = bikeTools[i];
            }

        }
    }

    public int InsertTool(BikeTools bikeTool) {
        if (IdCheck(bikeTool.getId()) == -1) {
            BikeTools[] bikeTools_tmp = new BikeTools[this.bikeTools.length + 1];
            System.arraycopy(this.bikeTools, 0, bikeTools_tmp, 0, this.bikeTools.length);
            bikeTools_tmp[bikeTools_tmp.length - 1] = bikeTool;
            this.bikeTools = bikeTools_tmp;
            bikeTools_tmp = null;
            return 1;

        } else {
            return 0;
        }

    }

    public int EditTool(int id, String name) {
        int pos = IdCheck(id);
        if (pos > -1) {
            this.bikeTools[pos].setName(name);
            return 1;
        } else {
            return 0;
        }

    }

    public int RemTool(int id) {
        int pos = IdCheck(id);
        BikeTools[] bikeTools_tmp = new BikeTools[bikeTools.length - 1];
        if (pos > -1) {

            while (pos < this.bikeTools.length - 1) {
                this.bikeTools[pos] = this.bikeTools[++pos];
            }

            System.arraycopy(this.bikeTools, 0, bikeTools_tmp, 0, bikeTools_tmp.length);
            this.bikeTools = bikeTools_tmp;
            bikeTools_tmp = null;
            return 1;
        } else {
            return 0;
        }
    }

    private int IdCheck(int id) {
        int i = 0;
        for (; i < this.bikeTools.length; i++) {
            if (id == this.bikeTools[i].getId()) {
                return i;
            }
        }
        return -1;
    }

}
