package org.example.section_2_flux;

import org.example.course_util.Util;
import org.example.section_2_flux.helper.NameGenerator;

public class Lec07FluxVsList {
    public static void main(String[] args) {
        NameGenerator.getNames(10).subscribe(Util.onNext());
    }
}
