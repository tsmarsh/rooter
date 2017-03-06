package com.tailoredshapes.rooter;

import org.junit.Test;

import static com.tailoredshapes.stash.Stash.stash;
import static org.junit.Assert.*;

/**
 * Created by tmarsh on 2/22/17.
 */
public class CoreTest {
    @Test
    public void shouldRouteGets() throws Exception {

        Optional<Handler> = get("/", (req) -> stash("status", 200, "headers", stash()));

    }
}