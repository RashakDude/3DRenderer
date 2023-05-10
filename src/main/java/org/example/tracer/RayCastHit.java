package org.example.tracer;

import lombok.Value;
import org.example.scene.SceneObject;
import org.example.scene.Vector3;

@Value
public class RayCastHit {
    SceneObject object;
    float t;
    Vector3 normal;
}
