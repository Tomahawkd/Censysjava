# Censys-java
Censys api for java

Not complete yet.

## Usage
Now I just implemented ip search.
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