package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static com.tw.pathashala.Length.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class LengthTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Length oneCentimeter = createCentimeter(1);
        Length anotherOneCentimeter = createCentimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Length oneCentimeter = createCentimeter(1);
        Length twoCentimeter = createCentimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }

    @Test
    void should_equate_1_m_to_100_cm() {
        Length hundredCentimeter = createCentimeter(100);
        Length oneMeter = Length.createMeter(1);

        assertThat(hundredCentimeter, is(equalTo(oneMeter)));
    }

    @Test
    void should_equate_100_cm_to_0_point_001_km() {
        Length hundredCentimeter = createCentimeter(100);
        Length pointZeroZeroOneKiloMeter = createKiloMeter(0.001);

        assertThat(hundredCentimeter, is(equalTo(pointZeroZeroOneKiloMeter)));
    }

    @Test
    void should_equate_1_m_plus_100_cm_to_2_m() {
        Length oneMeter = createMeter(1);
        Length hundredCentimeter = createCentimeter(100);
        Length twoMeter = createMeter(2);

        Length oneMeterPlusHundredCentimeter = oneMeter.plus(hundredCentimeter);

        assertThat(oneMeterPlusHundredCentimeter, is(equalTo(twoMeter)));
    }

    @Test
    void should_equate_200_cm_plus_1_km_to_100200_m() {
        Length twoHundredCentimeter = createCentimeter(200);
        Length oneKilometer = createKiloMeter(1);
        Length oneLakhTwoHundredCentimeter = createCentimeter(100200);

        Length twoHundredCentimeterPlusOneKilometer = twoHundredCentimeter.plus(oneKilometer);

        assertThat(twoHundredCentimeterPlusOneKilometer, is(equalTo(oneLakhTwoHundredCentimeter)));
    }

    @Test
    void should_equate_1_m_minus_50_cm_to_point_5_m() {
        Length oneMeter = createMeter(1);
        Length fiftyCentimeter = createCentimeter(50);
        Length pointFiveMeter = createMeter(0.5);

        Length oneMeterMinusFiftyCentimeter = oneMeter.minus(fiftyCentimeter);

        assertThat(oneMeterMinusFiftyCentimeter, is(equalTo(pointFiveMeter)));
    }

    @Test
    void should_equate_2000_cm_minus_1_m_to_1900_cm() {
        Length twoThousandCentimeter = createCentimeter(2000);
        Length oneMeter = createMeter(1);
        Length ninteenHundredCentimeter = createCentimeter(1900);

        Length twoThousandCentimeterMinusOneMeter = twoThousandCentimeter.minus(oneMeter);

        assertThat(twoThousandCentimeterMinusOneMeter, is(equalTo(ninteenHundredCentimeter)));
    }
}