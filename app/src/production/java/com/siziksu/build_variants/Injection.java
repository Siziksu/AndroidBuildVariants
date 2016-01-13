package com.siziksu.build_variants;

import com.siziksu.build_variants.data.Repositories;
import com.siziksu.build_variants.data.Repository;
import com.siziksu.build_variants.data.RepositoryImpl;

public class Injection {

    public static Repository provideRepository() {
        return Repositories.getInMemoryRepoInstance(new RepositoryImpl());
    }
}
