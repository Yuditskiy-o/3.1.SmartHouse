package ru.netology;

public class Radio {
    private String name;
    private int currentStation;
    private int defaultStations = 10;
    private int maxStation = 20;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getDefaultStation() {
        return defaultStations;
    }

    public void nextStation() {
        int nextStation = currentStation + 1;
        if (nextStation > maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = nextStation;
        }
    }

    public void prevStation() {
        int prevStation = currentStation - 1;
        if (prevStation < minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = prevStation;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        int nextVolume = currentVolume + 1;
        if (nextVolume > maxVolume) {
            return;
        }
        this.currentVolume = nextVolume;
    }

    public void decreaseCurrentVolume() {
        int prevVolume = currentVolume - 1;
        if (prevVolume < minVolume) {
            return;
        }
        this.currentVolume = prevVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
