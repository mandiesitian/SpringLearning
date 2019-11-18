package model;

import org.springframework.stereotype.Component;

//@Component(value = "dirtyAir")
public class DirtyAir implements IAir{
    @Override
    public String toString() {
        return "DirtyAir";
    }
}
