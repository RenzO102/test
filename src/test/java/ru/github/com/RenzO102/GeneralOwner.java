package ru.github.com.RenzO102;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:general.properties"})
 public interface GeneralOwner extends Config{

     @Key("Url")
     String Url();

     @Key("email")
     String email();

     @Key("password")
     String password();
}