/*Problem 8: Browser Cache Simulation
**Objective:** Simulate a simple browser cache that maintains the order of accessed pages.

        **Requirements:**
        - Use `LinkedHashMap` to store URL strings as keys and page contents as values.
- Implement LRU (Least Recently Used) cache eviction policy.
        - Provide functionalities to add, access, and display cached pages.*/
package problem_8;

import problem_8.data.BrowserCache;

public class Main {
    public static void main(String[] args) {
        //this class will store url upto 5, if 6th url need to be stored then LRU policy will delete first stored URL
        BrowserCache  browserCache=new BrowserCache();
        browserCache.addToCache("https://google.com","welcome to google");
        browserCache.addToCache("https://dell.com","welcome to Dell");
        browserCache.addToCache("https://hp.com","welcome to HP");
        browserCache.addToCache("https://tata.com","welcome to TATA");
        browserCache.addToCache("https://samsung.com","welcome to Samsung");
        browserCache.addToCache("https://shubham.com","welcome to shubham's space");//to store this url google.com will be removed according to LRU policy
        browserCache.accessCache("https://hp.com");//will display information about given url
        browserCache.displayCache();//will display all stored urls


    }
}
