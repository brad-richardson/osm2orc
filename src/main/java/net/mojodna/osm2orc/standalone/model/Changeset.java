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
    private TimestampContainer created_at;
    private TimestampContainer closed_at;
    private boolean open;
    private long num_changes;
    private String user;
    private long uid;
    private double min_lat;
    private double max_lat;
    private double min_lon;
    private double max_long;
    private long comments_count;
    private Map<String, String> tags = new HashMap<>();

    public Changeset(long id, TimestampContainer created_at, TimestampContainer closed_at,
                     boolean open, long num_changes, String user,
                     long uid, double min_lat, double max_lat,
                     double min_lon, double max_long, long comments_count) {
        this.id = id;
        this.created_at = created_at;
        this.closed_at = closed_at;
        this.open = open;
        this.num_changes = num_changes;
        this.user = user;
        this.uid = uid;
        this.min_lat = min_lat;
        this.max_lat = max_lat;
        this.min_lon = min_lon;
        this.max_long = max_long;
        this.comments_count = comments_count;
    }

    public long getId() {
        return id;
    }

    public TimestampContainer getCreated_at() {
        return created_at;
    }

    public TimestampContainer getClosed_at() {
        return closed_at;
    }

    public boolean isOpen() {
        return open;
    }

    public long getNum_changes() {
        return num_changes;
    }

    public String getUser() {
        return user;
    }

    public long getUid() {
        return uid;
    }

    public double getMin_lat() {
        return min_lat;
    }

    public double getMax_lat() {
        return max_lat;
    }

    public double getMin_lon() {
        return min_lon;
    }

    public double getMax_long() {
        return max_long;
    }

    public long getComments_count() {
        return comments_count;
    }

    public Map<String, String> getTags() {
        return tags;
    }

}
