package com.daehosting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void celsiusToFahrenheitTest() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), result);
    }

    @Test
    void fahrenheitToCelsiusTest() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.fahrenheitToCelsius(BigDecimal.valueOf(40));
        assertEquals(BigDecimal.valueOf(4.4444444), result);
    }

    @Test
    void windChillInCelsiusTest() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.windChillInCelsius(BigDecimal.valueOf(15), BigDecimal.valueOf(4));
        assertEquals(BigDecimal.valueOf(12.7704), result);
    }

    @Test
    void windChillInFahrenheitTest() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.windChillInFahrenheit(BigDecimal.valueOf(15), BigDecimal.valueOf(4));
        assertEquals(BigDecimal.valueOf(8.61072017), result);
    }

}