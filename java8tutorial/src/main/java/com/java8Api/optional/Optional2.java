/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.optional;

import java.util.Optional;

public class Optional2 {

    //else or elseOrGet API
    public static void main(String[] args) {
        String x = null;

       /* String value_found = Optional.of("default").orElse("value_found");
        System.out.println(value_found);

        String value1 = Optional.ofNullable(x).orElse("No_Value");
        System.out.println(value1);

        String no_value = Optional.ofNullable(x).orElse("No_Value");
        System.out.println(no_value);

        String s = Optional.of("default").orElseGet(() -> "value");
        System.out.println(s);

        String s1 = Optional.ofNullable(x).orElseGet(() -> "No_Value");
        System.out.println(s1);
*/
        String s2 = Optional.ofNullable(getString()).orElseGet(() -> "No_Value");
        System.out.println(s2);
    }

    private static String getString() {
        System.out.println("calling getString..");
        return "default_value";
    }
}
