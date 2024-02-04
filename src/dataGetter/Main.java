package dataGetter;
import com.google.gson.*;
import dataGetter.itemsResponse.Item;
import dataGetter.itemsResponse.ItemsResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static String[] exclusionKeywords = {"relic", "scene", "braton_prime", "paris_prime", };
    public static void main(String[] args) {
        APICaller apiCaller = new APICaller();
        String json = apiCaller.getItemList();

        ItemsResponse itemsResponse = new Gson().fromJson(json, ItemsResponse.class);

        List<Item> itemList = itemsResponse.getPayload().getItems();
        for(String keyword : exclusionKeywords){
            itemList = itemList.stream().filter(item -> !item.getUrlName().contains(keyword)).collect(Collectors.toList());
        }
        List<String> urlNames = itemList.stream().map(Item::getUrlName).toList();

        System.out.println(urlNames);
    }
}