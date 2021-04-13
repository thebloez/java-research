package thebloez.research.generic;

public class MultipleGeneric<T, E> {
    private T type;
    private E entity;

    public MultipleGeneric() {}

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public E getEntity() {
        return entity;
    }

    public void setEntity(E entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "MultipleGeneric : " +
                "type=" + type +
                ", entity=" + entity;
    }
}
