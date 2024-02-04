
package dataGetter.postsResponse;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class User {

    @SerializedName("reputation")
    @Expose
    private Integer reputation;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("avatar")
    @Expose
    private Object avatar;
    @SerializedName("ingame_name")
    @Expose
    private String ingameName;
    @SerializedName("last_seen")
    @Expose
    private String lastSeen;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("status")
    @Expose
    private String status;

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Object getAvatar() {
        return avatar;
    }

    public void setAvatar(Object avatar) {
        this.avatar = avatar;
    }

    public String getIngameName() {
        return ingameName;
    }

    public void setIngameName(String ingameName) {
        this.ingameName = ingameName;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
