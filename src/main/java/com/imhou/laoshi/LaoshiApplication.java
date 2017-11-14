package com.imhou.laoshi;

import com.imhou.laoshi.observer.CurrentConditions;
import com.imhou.laoshi.observer.WeatherDataSubject;
import com.imhou.laoshi.strategy.GreenHeadDuck;
import com.imhou.laoshi.strategy.StoneDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author imhou
 */
@SpringBootApplication
public class LaoshiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaoshiApplication.class, args);

		GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
		greenHeadDuck.fly();
		greenHeadDuck.quack();

		StoneDuck stoneDuck = new StoneDuck();
		stoneDuck.fly();
		stoneDuck.quack();

        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherDataSubject.registerObserver(currentConditions);
        weatherDataSubject.setData(30, 150, 40);
	}
}
