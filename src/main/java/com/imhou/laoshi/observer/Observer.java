package com.imhou.laoshi.observer;

/**
 * @author imhou
 */
public interface Observer {

    /**
     * 更新数据
     * @param temperature
     * @param pressure
     * @param humidity
     */
    void update(float temperature, float pressure, float humidity);

    /**
     * 提示有更新
     */
    void update();
}
