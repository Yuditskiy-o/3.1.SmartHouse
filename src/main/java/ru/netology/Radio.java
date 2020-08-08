package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
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

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
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
}
