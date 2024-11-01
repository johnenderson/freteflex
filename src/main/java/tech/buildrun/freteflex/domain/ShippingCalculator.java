package tech.buildrun.freteflex.domain;

import java.util.function.DoubleConsumer;

public interface ShippingCalculator {

    Double calculate(Double distance, Double weight);

}
