
package dataGetter.postsResponse;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Item {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("items_in_set")
    @Expose
    private List<ItemsInSet> itemsInSet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ItemsInSet> getItemsInSet() {
        return itemsInSet;
    }

    public void setItemsInSet(List<ItemsInSet> itemsInSet) {
        this.itemsInSet = itemsInSet;
    }

}
