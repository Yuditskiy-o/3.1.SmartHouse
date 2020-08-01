package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldNoSetTempLessMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(14);
        conditioner.setCurrentTemperature(-150);
        assertEquals(0,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNoSetTempOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(14);
        conditioner.setCurrentTemperature(50);
        assertEquals(0,conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(14);
        conditioner.setCurrentTemperature(16);
        conditioner.increaseCurrentTemperature();
        assertEquals(17,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotIncreaseTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(14);
        conditioner.setCurrentTemperature(28);
        conditioner.increaseCurrentTemperature();
        assertEquals(28,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(14);
        conditioner.setCurrentTemperature(24);
        conditioner.decreaseCurrentTemperature();
        assertEquals(23,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotDecreaseTemperatureLessMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(14);
        conditioner.setCurrentTemperature(14);
        conditioner.decreaseCurrentTemperature();
        assertEquals(14,conditioner.getCurrentTemperature());
    }
}


