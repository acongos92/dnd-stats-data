package com.dnd.log.configuration;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/")
public class ApiConfiguration extends Application{

}
