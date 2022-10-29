package ru.github.com.RenzO102;

import org.aeonbits.owner.Config;

 @Config.Sources({"classpath:general.properties"})
 public interface GeneralOwner extends Config{

     String target();

     @Config.Key("url.base")
     String url();

     @Config.Key("email")
     String email();

     @Config.Key("password")
     String password();
}
