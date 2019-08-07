package com.scriptpullerlib.lib;

/**
 * This class represents a gopigo3 jar that a bash shell script will download
 * and place in the correct folder so that a subsequent script ca execute a
 * program written to use this library will find it on the classpath.
 *
 * @author Ken Fogel
 */
public class ScriptPullerHello {

    /**
     * All we want to do is just return a string that says hello
     *
     * @param name
     * @return The hello string
     */
    public String getHello(String name) {
        return "Hello " + name;
    }

}
