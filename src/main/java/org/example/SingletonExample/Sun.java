package org.example.SingletonExample;

// This class is a lazy singleton - it only has ONE instance, which is publicly available
public class Sun {
    private static Sun instance;
    public static Integer defaultRadius = 100;

    private Integer radius; // default value: null
    // private int radius; // default value: 0

    private Sun(Integer radius) {
        this.radius = radius;
    }

    public static Sun getInstance() {
        if (instance == null) {
            // There is no Sun, create it
            instance = new Sun(defaultRadius);
            return instance;
        }
        else {
            // There is already a Sun, return it
            return instance;
        }
    }

    public Integer getRadius() {
        return radius;
    }
}
