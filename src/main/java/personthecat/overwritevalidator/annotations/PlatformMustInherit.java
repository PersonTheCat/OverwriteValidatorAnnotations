package personthecat.overwritevalidator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that a given method <b>cannot be overwritten</b> by all child
 * source sets. This solution is compile safe and will be validated by
 * <code>OverwriteValidator</code>.
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
public @interface PlatformMustInherit {}
