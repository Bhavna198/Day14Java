package com.bridgelabz;

public class CreatingNode<T> {
    private T data;
    private CreatingNode<T> next;

    public CreatingNode(T data) {
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CreatingNode<T> getNext() {
        return next;
    }

    public void setNext(CreatingNode<T> next) {
        this.next = next;
    }
}

