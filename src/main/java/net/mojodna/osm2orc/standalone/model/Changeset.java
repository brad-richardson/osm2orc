package net.mojodna.osm2orc.standalone.model;


import org.openstreetmap.osmosis.core.domain.common.TimestampContainer;

import java.util.HashMap;
import java.util.Map;

public class Changeset {

    public static final String ID = "id";
    public static final String CREATED_AT = "created_at";
    public static final String CLOSED_AT = "closed_at";
    public static final String OPEN = "open";
    public static final String NUM_CHANGES = "num_changes";
    public static final String USER = "user";
    public static final String UID = "uid";
    public static final String MIN_LAT = "min_lat";
    public static final String MAX_LAT = "max_lat";
    public static final String MIN_LON = "min_lon";
    public static final String MAX_LON = "max_lon";
    public static final String COMMENTS_COUNT = "comments_count";
    public static final String TAG = "tag";

    private long id;
    private TimestampContainer createdAt;
    private TimestampContainer closedAt;
    private boolean open;
    private long numChanges;
    private String user;
    private Long uid;
    private String minLat;
    private String maxLat;
    private String minLon;
    private String maxLon;
    private long commentsCount;
    private Map<String, String> tags = new HashMap<>();

    public Changeset(long id, TimestampContainer createdAt, TimestampContainer closedAt,
                     boolean open, long numChanges, String user,
                     Long uid, String minLat, String maxLat,
                     String minLon, String maxLon, long commentsCount) {
        this.id = id;
        this.createdAt = createdAt;
        this.closedAt = closedAt;
        this.open = open;
        this.numChanges = numChanges;
        this.user = user;
        this.uid = uid;
        this.minLat = minLat;
        this.maxLat = maxLat;
        this.minLon = minLon;
        this.maxLon = maxLon;
        this.commentsCount = commentsCount;
    }

    public long getId() {
        return id;
    }

    public TimestampContainer getCreatedAt() {
        return createdAt;
    }

    public TimestampContainer getClosedAt() {
        return closedAt;
    }

    public boolean isOpen() {
        return open;
    }

    public long getNumChanges() {
        return numChanges;
    }

    public String getUser() {
        return user;
    }

    public Long getUid() {
        return uid;
    }

    public String getMinLat() {
        return minLat;
    }

    public String getMaxLat() {
        return maxLat;
    }

    public String getMinLon() {
        return minLon;
    }

    public String getMaxLon() {
        return maxLon;
    }

    public long getCommentsCount() {
        return commentsCount;
    }

    public Map<String, String> getTags() {
        return tags;
    }
}
