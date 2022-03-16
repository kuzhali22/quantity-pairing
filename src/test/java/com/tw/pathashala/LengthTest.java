package com.tw.pathashala;
import org.junit.jupiter.api.Test;

import static com.tw.pathashala.Length.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class LengthTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Length oneCentimeter =  createCentimeter(1);
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

        assertThat(hundredCentimeter,is(equalTo(pointZeroZeroOneKiloMeter)));
    }

    @Test
    void should_equate_1_m_plus_100_cm_to_2_m() {
        Length twoMeter = createMeter(2);
        Length oneMeter = createMeter(1);
        Length hundredCentimeter = createCentimeter(100);

        Length oneMeterPluesHundredCentimeter = oneMeter.plus(hundredCentimeter);

        assertThat(oneMeterPluesHundredCentimeter,is(equalTo(twoMeter)));
    }


}