package com.rabbitking81.springrecipes.sequence;

public interface SequenceDao {

    public Sequence getSequence(String sequenceId);

    public int getNextValue(String sequenceId);
}
