package org.example.scene;

import org.example.tracer.Ray;

import java.util.Optional;

public interface SceneObject {
    Material getMaterial();
    Optional<Float> earliestIntersection(Ray ray);
    Vector3 normalAt(Vector3 point);
}
