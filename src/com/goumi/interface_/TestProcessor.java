package com.goumi.interface_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class TestProcessor {
}

class LowPass1 implements ProcessorInterface{
    double cutoff;

    public LowPass1(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Object input) {
        return (Waveform) input;
    }

    @Override
    public String name() {
        return null;
    }
}

class HighPass1 implements ProcessorInterface{
    double cutoff;

    public HighPass1(double cutoff) {
        this.cutoff = cutoff;
    }


    public Waveform process(Object input) {
        return (Waveform) input;
    }

    @Override
    public String name() {
        return null;
    }
}

class BandPass1 implements ProcessorInterface{
    double lowCutoff, highCutoff;

    public BandPass1(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    public Waveform process(Object input) {
        return (Waveform) input;
    }

    @Override
    public String name() {
        return null;
    }
}
