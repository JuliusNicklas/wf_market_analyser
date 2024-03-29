
package dataGetter.postsResponse;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Order {

    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("order_type")
    @Expose
    private String orderType;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("creation_date")
    @Expose
    private String creationDate;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("last_update")
    @Expose
    private String lastUpdate;
    @SerializedName("platinum")
    @Expose
    private Integer platinum;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("region")
    @Expose
    private String region;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getPlatinum() {
        return platinum;
    }

    public void setPlatinum(Integer platinum) {
        this.platinum = platinum;
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

}
