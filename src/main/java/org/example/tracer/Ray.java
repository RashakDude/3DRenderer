package org.example.tracer;

import lombok.Value;
import org.example.scene.Vector3;

@Value
public class Ray {
    Vector3 origin;
    Vector3 direction;

    public Vector3 at(float t) {
        return origin.plus(direction.times(t));
    }
}
