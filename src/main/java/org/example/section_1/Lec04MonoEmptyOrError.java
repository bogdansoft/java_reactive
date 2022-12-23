package org.example.section_1;

import org.example.course_util.Util;
import reactor.core.publisher.Mono;

public class Lec04MonoEmptyOrError {
    public static void main(String[] args) {
        userRepository(10).subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }

    private static Mono<String> userRepository(int userId) {
        //1
        if (userId == 1) {
            return Mono.just(Util.faker().name().firstName());
        } else if (userId == 2) {
            return Mono.empty();//null
        } else {
            return Mono.error(new RuntimeException("Not in the allowing range"));
        }
    }
}
