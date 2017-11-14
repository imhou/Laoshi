package com.imhou.laoshi.observer;

/**
 * @author imhou
 */
public interface Subject {

    /**
     *
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     *通知观察者有更新
     */
    void notifyObserver();

    /**
     * 推送数据给观察者
     */
    void pushDataToObserver();
}
