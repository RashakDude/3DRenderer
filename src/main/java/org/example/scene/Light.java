package org.example.scene;

import lombok.Value;

@Value
public class Light {
    Vector3 position;
    Color intensitySpecular;
    Color intensityDiffuse;
}
