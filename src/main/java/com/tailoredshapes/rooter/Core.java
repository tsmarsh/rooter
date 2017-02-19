package com.tailoredshapes.rooter;

import com.tailoredshapes.stash.Stash;

import java.util.Optional;

import static com.tailoredshapes.underbar.UnderBar.optional;


public interface Core {


    static Optional<String> formMethod(Stash request){
        Optional<String> formMethod = optional();
        if(request.contains("form-params")){
            Stash formParams = request.get("form-params");
            if(formParams.contains("_method")){
                formMethod = optional(formParams.get("_method"));
            }
        }if(!formMethod.isPresent() && request.contains("multipart-params")){
            Stash multipartParams = request.get("multipart-params");
            if(multipartParams.contains("_method")){
                formMethod = optional(multipartParams.get("_method"));
            }
        }
        return formMethod;
    }
}
