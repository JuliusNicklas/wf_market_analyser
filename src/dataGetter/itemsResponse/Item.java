
package dataGetter.itemsResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("url_name")
    @Expose
    private String urlName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("item_name")
    @Expose
    private String itemName;

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public Item withUrlName(String urlName) {
        this.urlName = urlName;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item withId(String id) {
        this.id = id;
        return this;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Item withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Item withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

}
