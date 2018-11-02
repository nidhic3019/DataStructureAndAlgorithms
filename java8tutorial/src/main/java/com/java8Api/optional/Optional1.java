/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.optional;
/*oprional is a container to hold atost one value, Used to represent a value is absent or present.
 * It avoids any runtime NullPointerExceptions */

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {

        //Creating an optional object

        Optional empty = Optional.empty();
        boolean isPresent = empty.isPresent();
        System.out.println(isPresent);

        String name = "Nidhi Chourasia";
        Optional<String> optional = Optional.of(name);
        System.out.println(optional);

        //Below statement will throw null pointer exception
        String name1 = null;
      /*  Optional<String> name11 = Optional.of(name1);
        System.out.println(name11);*/

        //To avoid NullpointerException
        //If we pass null reference the below code snippet will return optional empty
        Optional<String> name2 = Optional.ofNullable(name1);
        System.out.println(name2);

        //we can give conditional statement too
        String no_value = Optional.ofNullable(name1).orElse("No Value");
        System.out.println(no_value);

        String nullName = null;
        String name4 = Optional.ofNullable(nullName).orElseGet(() -> name1);
        System.out.println(name4);
    }
}
