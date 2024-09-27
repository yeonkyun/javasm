package edu.sunmoon.enums;

public enum CustomerLevel {
    일반, 실버, 골드, VIP;

    public static CustomerLevel fromString(String value) {
        return valueOf(value);
    }
}