package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNoChangeStationMoreMax() {
        radio.setCurrentStation(25);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNoChangeStationLessMin() {
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetDefaultStation10() {
        radio.setCurrentStation(11);
        assertEquals(10, radio.getDefaultStations());
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        radio.setCurrentStation(10);
        assertEquals(20, radio.getMaxStation());
    }

    @Test
    public void shouldSetMinStation() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldSetNextStation() {
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(11, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetNextStationOverMax() {
        radio.setCurrentStation(20);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        radio.setCurrentStation(10);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetPrevStationLessMin() {
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(20, radio.getCurrentStation());
    }

    @Test
    public void shouldNoChangeVolumeMoreMax() {
        radio.setCurrentVolume(150);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNoChangeVolumeLessMin() {
        radio.setCurrentVolume(-50);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setCurrentVolume(50);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetNextVolume() {
        radio.setCurrentVolume(50);
        radio.increaseCurrentVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetNextVolumeOverMax() {
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetPrevVolumeLessMin() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}