package entity;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Item {
	private String itemId;
	private String name;
	private String address;
	private Set<String> keywords;
	private String imageUrl;
	private String url;
	
	public JSONObject toJSONObject() {
		JSONObject obj = new JSONObject();
		obj.put("item_id", itemId);
		obj.put("name", name);
		obj.put("address", address);
		obj.put("keywords", new JSONArray(keywords));
		obj.put("image_url", imageUrl);
		obj.put("url", url);
		return obj;
	}

}
 

//public class Item {
//	private String itemId;
//	private String name;
//	private String address;
//	private Set<String> keywords;
//	private String imageUrl;
//	private String url;
//
//	private Item(ItemBuilder builder) {
//		this.itemId = builder.itemId;
//		this.name = builder.name;
//		this.address = builder.address;
//		this.imageUrl = builder.imageUrl;
//		this.url = builder.url;
//		this.keywords = builder.keywords;
//	}
//
//	public String getItemId() {
//		return itemId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public Set<String> getKeywords() {
//		return keywords;
//	}
//
//	public String getImageUrl() {
//		return imageUrl;
//	}
//
//	public String getUrl() {
//		return url;
//	}
//
//	public static class ItemBuilder {
//		private String itemId;
//		private String name;
//		private String address;
//		private String imageUrl;
//		private String url;
//		private Set<String> keywords;
//		
//		public ItemBuilder() {}
//		
//		public void setItemId(String itemId) {
//			this.itemId = itemId;
//			return this;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//			return this;
//		}
//
//		public void setAddress(String address) {
//			this.address = address;
//			return this;
//		}
//
//		public void setImageUrl(String imageUrl) {
//			this.imageUrl = imageUrl;
//			return this;
//		}
//
//		public void setUrl(String url) {
//			this.url = url;
//			return this;
//		}
//
//		public void setKeywords(Set<String> keywords) {
//			this.keywords = keywords;
//			return this;
//		}
//		
//		
//		public Item build() {
//			return new Item(this);
//		}
//		
//		// Item item = new Item.ItemBuilder().setName().setUrl().build();
//		// Item item = Item.builder()
//	}
//}
