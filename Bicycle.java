/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeStore;

import enums.Material;
import enums.BrakeType;

/**
 *
 * @author Pedro
 */
public class Bicycle {

    /**
     * Identificador numérico da bicicleta
     */
    private int id;
    /**
     * Número de velocidades
     */
    private int numberOfGears;
    /**
     * Cor da bicicleta
     */
    private String mainColor;
    /**
     * Diâmetro das rodas
     */
    private float weelSize;

    /**
     * Tipo de travões TODO: BrakeType
     */
    BrakeType brakes;

    /**
     * Tipo de material TODO: Material
     */
    Material material;

    /**
     * Preço da bicicleta
     */
    private float price;

    /**
     * Número de anos de garantia
     */
    private int guaranteeYears;

    /**
     * Método construtor para a criação de uma instância de
     * {@link Biclycle bicicleta}.
     *
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guaranteeYears Anos de garantia da bicicleta
     */
    public Bicycle(int id, int numberOfGears, String mainColor, float weelSize,
            BrakeType brakes, Material material, float price, int guaranteeYears) {
        this.setId(id);
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.weelSize = weelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guaranteeYears = guaranteeYears;
    }

    /**
     *
     * @return o {@link Bicycle#id id} de uma bicicleta
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id {@link Bicycle#id id} de uma bicicleta
     */
    public final void setId(int id) {
        this.id = id;
    }

}
