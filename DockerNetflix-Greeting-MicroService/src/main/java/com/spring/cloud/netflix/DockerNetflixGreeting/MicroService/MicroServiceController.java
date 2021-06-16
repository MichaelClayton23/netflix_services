/**
 * 
 */
package com.spring.cloud.netflix.DockerNetflixGreeting.MicroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author angel
 *
 */
public class MicroServiceController {
	
	MicroServiceService microServiceService;
	 
    public MicroServiceController(@Autowired MicroServiceService microServiceService) {
        this.microServiceService=microServiceService;
    }
 
    @GetMapping("/greet")
    public String getGreeting() throws Exception {
        return microServiceService.getServiceGreeting();
    }

}
