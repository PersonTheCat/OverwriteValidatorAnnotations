package personthecat.overwritevalidator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * When used at the class level, indicates that any member not present in the annotated
 * class will be defined and copied from the common source set.
 * <p>
 *   This solution is compile safe and will validated by <code>OverwriteValidator</code>
 * </p>
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface InheritMissingMembers {}
