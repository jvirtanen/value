package org.jvirtanen.value;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * <code>Value</code> is a base class for value objects.
 */
public class Value {

    private static final ToStringStyle STYLE = new StandardToStringStyle() {
        {
            setUseShortClassName(true);
            setUseFieldNames(false);
            setUseIdentityHashCode(false);
            setContentStart("(");
            setContentEnd(")");
        }
    };

    /**
     * Compares the specified object with this value for equality. Returns
     * <code>true</code> if and only if the specified object is an instance
     * of this value's class and its fields are equal to this value's fields.
     *
     * @param obj an object
     * @return <code>true</code> if the specified object is equal to this
     *   value.
     */
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    /**
     * Returns a hash code value for this value.
     *
     * @return a hash code value for this value.
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Returns a string reprentation of this value. The string representation
     * consists of the class name of followed by string representations of the
     * fields separated by commas ("<code>,</code>") and enclosed in parentheses
     * ("<code>()</code>").
     *
     * @return a string representation of this value.
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, STYLE);
    }

}
