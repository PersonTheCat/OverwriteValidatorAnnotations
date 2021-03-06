package personthecat.overwritevalidator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that a file is designed to overwrite a class in the common
 * source set. This solution is compile safe and will be validated by
 * <code>OverwriteValidator</code>.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface OverwriteClass {}
