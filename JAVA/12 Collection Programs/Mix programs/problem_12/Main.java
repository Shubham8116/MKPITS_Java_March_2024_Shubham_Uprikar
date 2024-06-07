//### Problem 12: URL Shortener
//**Objective:** Implement a URL shortening service.
//
//**Requirements:**
//- Use `Hashtable` to store short URL codes as keys and original URLs as values.
//- Generate short codes for new URLs and store them in the hashtable.
//- Provide functionalities to add new URLs and retrieve original URLs using short codes.
package problem_12;

import problem_12.data.UrlShortner;

public class Main {
    public static void main(String[] args) {
        UrlShortner url =new UrlShortner();
        //adding urls

        url.addURL("goog","https://google.com");
        url.addURL("dell","https://dell.com");
        url.addURL("hp","https://hp.com");
        url.addURL("sam","https://samsung.com");
        url.addURL("shubham","https://shubham.com");
        url.display();
        url.removeURL("shubham");//removing url
        url.display();
    }
}
