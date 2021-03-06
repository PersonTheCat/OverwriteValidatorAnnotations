package personthecat.overwritevalidator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that a given class should be overwritten in all child source sets.
 * <p>
 *   This marker is validated by <code>OverwriteValidator</code>.
 * </p>
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@SuppressWarnings("unused")
public @interface OverwriteTarget {
    boolean required() default false;
}
