package _03_Spaceship;

import _03_Spaceship.Spaceship;

import java.util.Collection;

public class SpaceshipHelper{
    public static double avgSpeed(Collection<Spaceship> spaceships){
        return spaceships.stream().mapToDouble(Spaceship::getSpeed).average().getAsDouble();
    }

    public static double minSpeed(Collection<Spaceship> spaceships){
        return spaceships.stream().mapToDouble(Spaceship::getSpeed).min().getAsDouble();
    }
}
