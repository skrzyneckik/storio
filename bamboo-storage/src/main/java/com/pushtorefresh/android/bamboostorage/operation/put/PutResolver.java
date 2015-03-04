package com.pushtorefresh.android.bamboostorage.operation.put;

import android.content.ContentValues;
import android.support.annotation.NonNull;

import com.pushtorefresh.android.bamboostorage.BambooStorage;

public interface PutResolver<T> {

    PutResult performPut(@NonNull BambooStorage bambooStorage, @NonNull ContentValues contentValues);

    void afterPut(@NonNull T object, @NonNull PutResult putResult);
}