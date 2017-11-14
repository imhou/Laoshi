package com.imhou.laoshi.observer;

/**
 * @author imhou
 */
public class CurrentConditions implements Observer{

    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {

        this.mTemperature = temperature;
        this.mPressure = pressure;
        this.mHumidity = humidity;

        display();
    }

    @Override
    public void update() {
        update( WeatherDataSubject.getTemperature(), WeatherDataSubject.getPressure(), WeatherDataSubject.getHumidity() );
    }

    private void display() {
        System.out.println("Temperature is: " + this.mTemperature);
        System.out.println("Pressure    is: " + this.mPressure);
        System.out.println("Humidity    is: " + this.mHumidity);
    }
}
