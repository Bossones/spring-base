package ru.bossones.dependencyinjection;

public class SetterDi {

    private int intSetter;
    private ThingTwo thingTwo;
    private ThingThree thingThree;

    public void setIntSetter(int intSetter) {
        this.intSetter = intSetter;
    }

    public void setThingTwo(ThingTwo thingTwo) {
        this.thingTwo = thingTwo;
    }

    public void setThingThree(ThingThree thingThree) {
        this.thingThree = thingThree;
    }

    public int getIntSetter() {
        return intSetter;
    }

    public ThingTwo getThingTwo() {
        return thingTwo;
    }

    public ThingThree getThingThree() {
        return thingThree;
    }
}
