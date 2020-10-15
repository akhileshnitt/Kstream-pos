package guru.learningjournal.kafka.examples.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StoreNotification {
    @JsonProperty("StoreId")
    private String storeId;
    @JsonProperty("TotalAmount")
    private Double totalAmount;


    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public StoreNotification withTotalAmount(Double totalAmount) {
        this.totalAmount  = totalAmount;
        return this;
    }

    public StoreNotification witStoreId(String storeID) {
        this.storeId  = storeID;
        return this;
    }
}
