package com.zzlab.repositories;

import com.zzlab.models.Marker;

import java.util.List;

public interface MarkerRepo {

    Marker create(String name, String password);

    List<Marker> getAll();

    List<Marker> getAll(int limit, int offset);

    Marker get(long id);

    Marker getByName(String name);

    Marker update(Marker marker);

    void delete(long id);
}
