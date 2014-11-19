package org.blogdemo.fbdemo;

import facebook4j.PostUpdate;
/**
 * A bean which we use in the route
 */
public class FBUpdator{

   
    private PostUpdate updates = null;

    public PostUpdate update(String text) {
        updates = new PostUpdate(text);
        return updates;
    }

   
}
