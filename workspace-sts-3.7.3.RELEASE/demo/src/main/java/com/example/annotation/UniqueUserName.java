package com.example.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {UniqueUsernameValidator.class })

public @interface UniqueUserName {

	String message() default "please provide a valid user name:+ names are mahi,ravi,ram";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
