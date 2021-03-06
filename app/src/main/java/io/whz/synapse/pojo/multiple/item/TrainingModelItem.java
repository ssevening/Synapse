package io.whz.synapse.pojo.multiple.item;

import android.support.annotation.NonNull;

import io.whz.synapse.pojo.neural.Model;

public class TrainingModelItem {
    private final Model mModel;
    private final int mStepSnapShot;

    public TrainingModelItem(@NonNull Model model) {
        mModel = model;
        mStepSnapShot = model.getStepEpoch();
    }

    public Model getModel() {
        return mModel;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof TrainingModelItem)
                && ((TrainingModelItem) obj).mStepSnapShot == this.mStepSnapShot;
    }
}
