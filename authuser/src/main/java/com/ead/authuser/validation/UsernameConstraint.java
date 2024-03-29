package com.ead.authuser.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = UsernameConstraintImp.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface UsernameConstraint {

        String message() default "Invalid Username";
        Class<?>[] groups() default {};
        Class<? extends Payload>[] payload() default {};

}
