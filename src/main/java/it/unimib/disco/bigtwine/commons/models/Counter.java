package it.unimib.disco.bigtwine.commons.models;

public class Counter<T> {
    private T instance;
    private long count;

    public Counter(T instance) {
        this.instance = instance;
    }

    public Counter(T instance, long count) {
        this(instance);
        this.count = count;
    }

    public T get() {
        return instance;
    }

    public long getCount() {
        return count;
    }

    public void increment(long value) {
        this.count += value;
    }

    public void increment() {
        this.increment(1);
    }

    public void decrement(long value) {
        this.count -= value;
        if (this.count < 0) {
            this.count = 0;
        }
    }

    public void decrement() {
        this.decrement(1);
    }

    public boolean hasMore() {
        return this.count > 0;
    }
}
