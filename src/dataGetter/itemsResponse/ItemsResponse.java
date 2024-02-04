
package dataGetter.itemsResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemsResponse {

    @SerializedName("payload")
    @Expose
    private Payload payload;

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public ItemsResponse withPayload(Payload payload) {
        this.payload = payload;
        return this;
    }

}
