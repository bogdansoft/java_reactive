package org.example.section_1_mono;

import java.util.stream.Stream;

public class Lec01Stream {
    public static void main(String[] args) {
        Stream.of(1)
                .map(i -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i * 2;
                }).forEach(System.out::println);
    }
}
