package org.example.packagebycomponent.notification.domain.model;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import java.time.LocalDateTime;
import java.util.Objects;

public class Notification {

    private final String receiver;
    private final String sender;
    private final String describe;
    private final LocalDateTime occurredIn;


    public Notification(String target,
                        String describe,
                        String channel) {

        Validate.isTrue(StringUtils.isNotBlank(target));
        Validate.isTrue(StringUtils.isNotBlank(describe));
        Validate.isTrue(StringUtils.isNotBlank(channel));

        this.target = target;
        this.describe = describe;
        this.channel = channel;
        this.occurredIn = LocalDateTime.now();

    }

    public String getTarget() { return target; }
    public String getDescribe() { return describe; }
    public String getChannel() { return channel; }
    public LocalDateTime getOccurredIn() { return occurredIn; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(target, that.target) &&
                Objects.equals(describe, that.describe) &&
                Objects.equals(channel, that.channel) &&
                Objects.equals(occurredIn, that.occurredIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target, describe, channel, occurredIn);
    }

    @Override
    public String toString() {
        return "Notification{" +
                "target='" + target + '\'' +
                ", describe='" + describe + '\'' +
                ", channel='" + channel + '\'' +
                ", occurredIn=" + occurredIn +
                '}';
    }
}
