# Censys-java
Censys api for java

Not complete yet.

## Usage
Currently I have implemented search api.
```java
public class Main {
    public static void main(String[] args){
        IpSearchApi api = new IpSearchApi("uid", "secret");
        Response<SearchMessage> r = api.search("query", 1, null);
        if (r.isError()) {
        	ErrorMessage err = r.getErrorMessage();
        	// do things you would like to do

        } else {
            SearchMessage s = r.getExpectMessage();
            // do things you would like to do

        }
    }
}
```

## Development on Custom Message
Since I made full use of java's reflection technique, now building a custom message is much easier.

### How to build
What to do is just focus on your message content.
```java
public class YourMessage extends AbstractMessage {
	
	// Use this annotation if necessary
	// More information about field customization 
	// please go to https://github.com/google/gson
	@SerializedName("m")
	private String message;
	
    public String getMessage() {
    	return message;
    }
}
```

### About custom Serializer/Deserializer/TypeAdapter

Just add one line for registration
```java
public class DateSerializer implements JsonSerializer<Date> {
	
	static {
		TypeAdapterRegister.getInstance().register(Date.class, new DateSerializer());
	}
	
	@Override
    public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
		return context.serialize(src.toString());
	}
}
```