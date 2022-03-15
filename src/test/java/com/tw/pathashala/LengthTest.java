package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static com.tw.pathashala.Length.createCentimeter;
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

        assertThat(oneMeter, is(equalTo(hundredCentimeter)));
    }

    @Test
    void should_equate_100_cm_to_0_point_001_km() {
        Length hundredCentimeter = createCentimeter(100);
        Length kiloMeter = Length.createKiloMeter(0.001);

        assertThat(kiloMeter,is(equalTo(hundredCentimeter)));
    }
}
