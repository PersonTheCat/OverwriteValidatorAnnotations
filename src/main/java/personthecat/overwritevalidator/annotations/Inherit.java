package personthecat.overwritevalidator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that a field or method is only a template and is designed to be replaced at
 * compile time. Its value will be inherited from the common source set.
 * <p>
 *   This solution is compile safe and will be validated by <code>OverwriteValidator</code>.
 * </p>
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
public @interface Inherit {}
