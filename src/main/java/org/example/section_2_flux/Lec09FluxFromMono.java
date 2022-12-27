package org.example.section_2_flux;

import org.example.course_util.Util;
import reactor.core.publisher.Flux;

public class Lec09FluxFromMono {
    public static void main(String[] args) {
        Flux.range(1, 10)
                .next() // 1
                .filter(i -> i > 3)
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }
}
