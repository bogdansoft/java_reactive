package org.example.section_2_flux;

import org.example.course_util.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Lec03FluxFromArrayOrList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d");
        Flux.fromIterable(strings).subscribe(Util.onNext());

        Integer[] arr = {1, 3, 5, 7};
        Flux.fromArray(arr).subscribe(Util.onNext());
    }
}
