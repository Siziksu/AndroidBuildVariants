package com.siziksu.build_variants.data;

import android.support.annotation.NonNull;

public class Repositories {

    private Repositories() {
        // no instance
    }

    private static Repository repository = null;

    public synchronized static Repository getInMemoryRepoInstance(@NonNull Repository repository) {
        if (null == Repositories.repository) {
            Repositories.repository = repository;
        }
        return Repositories.repository;
    }
}
