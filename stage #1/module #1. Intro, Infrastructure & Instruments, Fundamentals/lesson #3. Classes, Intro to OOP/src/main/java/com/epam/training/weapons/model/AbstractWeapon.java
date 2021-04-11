package com.epam.training.weapons.model;

import java.util.Objects;

public abstract class AbstractWeapon {
    private final String name;

    public AbstractWeapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractWeapon that = (AbstractWeapon) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
