package ru.netology;

public class BonusMilesService {
    public int calculate(int price) {
        int rublesPerMiles = 20;
        int miles = price / rublesPerMiles;
        return miles;
    }
}
