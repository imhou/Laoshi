package com.imhou.laoshi.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author imhou
 */
public class WeatherDataSubject implements Subject{

    List<Observer> observerList;

    private static float mTemperature;
    private static float mPressure;
    private static float mHumidity;

    public WeatherDataSubject(){
        observerList = new ArrayList<>();
    }


    /**
     * 设置数据
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {

        boolean isChanged = mTemperature != temperature;

        isChanged = (mPressure != pressure) || isChanged;

        isChanged = (mHumidity != humidity) || isChanged;

        mTemperature = temperature;

        mPressure = pressure;

        mHumidity = humidity;

        if (isChanged) {
            dataChange();
        }
    }

    /**
     * 数据变更
     */
    private void dataChange(){
        // 通知观察者，让观察者自己获取数据
        notifyObserver();

        // 推送数据给观察者
//        pushDataToObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList != null && observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        if (observerList != null) {
            for (Observer observer : observerList) {
                observer.update();
            }
        }
    }

    @Override
    public void pushDataToObserver() {
        if (observerList != null) {
            for (Observer observer : observerList) {
                observer.update(getTemperature(), getPressure(), getHumidity());
            }
        }
    }

    /**
     *
     * @return
     */
    public static float getTemperature() {
        return mTemperature;
    }

    /**
     *
     * @param temperature
     */
    private void setTemperature(float temperature) {
        mTemperature = temperature;
    }

    /**
     *
     * @return
     */
    public static float getPressure() {
        return mPressure;
    }

    /**
     *
     * @param pressure
     */
    private void setPressure(float pressure) {
        mPressure = pressure;
    }

    /**
     *
     * @return
     */
    public static float getHumidity() {
        return mHumidity;
    }

    /**
     *
     * @param humidity
     */
    private void setmHumidity(float humidity) {
        mHumidity = humidity;
    }

}
