package ru.netology.domane.Con;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();
    @Test
    public void setUpCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setUpCurrentVolume();
        int expected = 3;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setUpCurrentVolumeWhenMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setUpCurrentVolume();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setDownCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setDownCurrentVolume();
        int expected = 1;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setDownCurrentVolumeWhenMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setDownCurrentVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    public void setUpCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.setUpCurrentStation();
        int expected = 8;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setLastStationWhenFirst() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setDownCurrentStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void setRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }



    @Test
    public void setCurrentVolumme() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setFirstStationWhenLast() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setUpCurrentStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void setDownCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.setDownCurrentStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }
}

