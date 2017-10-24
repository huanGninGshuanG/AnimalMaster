package PlantFactory.Vegetable;

import Extend.LifeCycle;
import Root.GameObject;

public class Tomato extends Vegetable {

    private static Tomato tomato = new Tomato();

    protected String PlantName = "Tomato";

    @Override
    public GameObject clone()
    {
        return new Tomato();
    }

    public Tomato(){
        lifePeriod = LifeCycle.SEED;
        super.addPrototype(this);
    }


    void printLifePeriod()
    {
        System.out.println(this.lifePeriod);
    }

    public void destroy()
    {
        super.destroy(this);
    }

    public static Tomato Clone()
    {
        return new Tomato();
    }

    public void update(){
        System.out.println(this.getPlantName()+" get Updated");
    }

    @Override
    public String getPlantName() {
        return PlantName;
    }

}