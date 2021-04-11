package com.epam.training.weapons.model;

import java.util.Objects;

public class SteelGun extends AbstractWeapon {

    private int capacity;
    public SteelGun(String name) {
        super(name);
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SteelGun steelGun = (SteelGun) o;
        return capacity == steelGun.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
