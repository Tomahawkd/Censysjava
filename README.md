# Censys-java
Censys api for java

Not complete yet.

## Usage

Basically the api usage is as follows.
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

But things get different when meeting report api because of its 
field param is various so that the response of keys in the message 
has a large of class potentially to be. At the moment, when you want 
to get keys from response you need to cast it yourself.
```java
public class Main {
    public static void main(String[] args){
        IpSearchApi api = new IpSearchApi("uid", "secret");
        Response<ReportMessage> r = api.report("query", "field", 10);
        if (r.isError()) {
        	ErrorMessage err = r.getErrorMessage();
        	// do things you would like to do

        } else {
            ReportMessage s = r.getExpectMessage();
            
            String data = s.getResults().get(0).getKey();
            // for custom message
            new ExpectMessage().parse(data).function();
            // Use converter
            new GsonBuilder().registerTypeAdapter(YourClass.class, new Converter()).create().fromJson(data, YourClass.class);
            // Primitive value Integer for example
            Integer.parseInt(data);
            
            // do things you would like to do

        }
    }
}
```