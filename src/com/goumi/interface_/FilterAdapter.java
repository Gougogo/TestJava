package com.goumi.interface_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class FilterAdapter implements ProcessorInterface{
    Filter filter = null;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        if (input instanceof Waveform)
            return filter.process((Waveform) input);
        else {
            System.out.println("不是Wave类型");
            return null;
        }
    }

    public static void main(String[] args) {
        FilterAdapter filterAdapter = new FilterAdapter(new LowPass(20));
        Apply_1.process(filterAdapter, new Waveform());
        Apply_1.process(filterAdapter, new Waveform());

    }
}
