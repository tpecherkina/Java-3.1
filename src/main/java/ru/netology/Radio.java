package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxStation = 9;
    private int minStation = 0;


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


    public void switchStationNext() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        } else {
            currentStation++;
        }
    }

    public void switchStationPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation -= 1;
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
    
       public void volumeUp() {
        if (currentVolume == maxVolume) return;
        soundVolume++;
    }

    public void volumeDown() {
        if (currentVolume == minVolume) return;
        soundVolume--;
    }


}
