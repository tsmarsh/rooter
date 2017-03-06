package com.tailoredshapes.rooter;

import com.tailoredshapes.stash.Stash;

import java.util.Optional;
import java.util.regex.Pattern;

import static com.tailoredshapes.underbar.UnderBar.optional;


public interface Core {

    static <T> Optional<T> get(Pattern route, Stash request, T handler){
        
    }
}
