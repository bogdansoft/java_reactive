package org.example.section_2_flux.helper;

import org.example.course_util.Util;
import reactor.core.publisher.Flux;

public class NameGenerator {
    public static Flux<String> getNames(int count) {
        return Flux.range(0, count).map(i -> getName());
    }

    public static String getName() {
        Util.sleepSeconds(1);
        return Util.faker().name().fullName();
    }
}
