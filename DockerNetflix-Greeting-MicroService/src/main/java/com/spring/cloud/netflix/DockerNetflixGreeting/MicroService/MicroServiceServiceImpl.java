/**
 * 
 */
package com.spring.cloud.netflix.DockerNetflixGreeting.MicroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * @author angel
 *
 */
public class MicroServiceServiceImpl implements MicroServiceService {

	@Autowired
    private Environment env;
 
    @Override
    public String getServiceGreeting() throws Exception {
        String portValue = env.getProperty("server.port");
        String returnValue = "Something unexpected happened, no greeting for you";
        if(portValue!= null && !portValue.isEmpty()) {
            returnValue = new StringBuilder().append("Hello from port: ").append(portValue).append("n").toString();
        }
        return returnValue;
    }

}
