package com.njkol.designpatterrns.behavioural.iterator;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}