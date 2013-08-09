package org.marketcetera.client;

import org.marketcetera.util.misc.ClassVersion;
import org.apache.commons.lang.ObjectUtils;

import java.beans.ConstructorProperties;
import java.util.Arrays;

/* $License$ */
/**
 * The set of parameters needed to initialize the client. These parameters
 * are provided to the following methods.
 * <ul>
 *      <li>{@link ClientManager#init(ClientParameters)}</li>
 *      <li>{@link Client#reconnect(ClientParameters)}</li>
 * </ul>
 *
 * @author anshul@marketcetera.com
 * @version $Id: ClientParameters.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: ClientParameters.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class ClientParameters {
    /**
     * Gets the user name to use when connecting to the server.
     *
     * @return the user name.
     */
    public String getUsername() {
        return mUsername;
    }

    /**
     * The password to use when connecting to the server.
     *
     * @return the password.
     */
    public char[] getPassword() {
        return mPassword;
    }

    /**
     * The URL of the server.
     *
     * @return the URL of the server.
     */
    public String getURL() {
        return mURL;
    }

    /**
     * The port number of the server.
     *
     * @return the server port number.
     */
    public int getPort() {
        return mPort;
    }

    /**
     * The server hostname.
     *
     * @return the server hostname.
     */
    public String getHostname() {
        return mHostname;
    }

    /**
     * The string to prefix to the orderIDs generated by this class.
     *
     * @return the string to prefix to the orderIDs generated by this class.
     */
    public String getIDPrefix() {
        return mIDPrefix;
    }

    /**
     * The time interval between heartbeats, in ms.
     *
     * @return the time interval.
     */
    public int getHeartbeatInterval() {
        return mHeartbeatInterval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientParameters that = (ClientParameters) o;

        return Arrays.equals(mPassword, that.mPassword) &&
                ObjectUtils.equals(mURL, that.mURL) &&
                ObjectUtils.equals(mUsername, that.mUsername) &&
                ObjectUtils.equals(mHostname, that.mHostname) &&
                ObjectUtils.equals(mIDPrefix, that.mIDPrefix) &&
                ObjectUtils.equals(mPort, that.mPort) &&
                ObjectUtils.equals(mHeartbeatInterval, that.mHeartbeatInterval);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCode(mUsername) +
                Arrays.hashCode(mPassword) +
                ObjectUtils.hashCode(mHostname) +
                ObjectUtils.hashCode(mPort) +
                ObjectUtils.hashCode(mHeartbeatInterval) +
                ObjectUtils.hashCode(mIDPrefix) +
                ObjectUtils.hashCode(mURL);
    }

    /**
     * Creates an instance.
     *
     * @param inUsername the user name.
     * @param inPassword the password.
     * @param inURL the URL.
     * @param inHostname the host name
     * @param inPort the port number
     * @param inIDPrefix the string to prefix to the orderIDs generated
     * by the client based on the IDs from the server.
     * @param inHeartbeatInterval time interval between heartbeats, in ms.
     */
    @ConstructorProperties({"username", 
            "password",
            "URL",
            "hostname",
            "port",
            "IDPrefix",
            "heartbeatInterval"})
    public ClientParameters(String inUsername, char[] inPassword,
                            String inURL, String inHostname, int inPort,
                            String inIDPrefix, int inHeartbeatInterval) {
        mUsername = inUsername;
        mPassword = inPassword;
        mURL = inURL;
        mHostname = inHostname;
        mPort = inPort;
        mIDPrefix = inIDPrefix;
        mHeartbeatInterval = inHeartbeatInterval;
    }


    /**
     * Creates an instance.
     *
     * @param inUsername the user name.
     * @param inPassword the password.
     * @param inURL the URL.
     * @param inHostname the host name
     * @param inPort the port number
     * @param inIDPrefix the string to prefix to the orderIDs generated
     * by the client based on the IDs from the server.
     */
    public ClientParameters(String inUsername, char[] inPassword,
                            String inURL, String inHostname, int inPort,
                            String inIDPrefix) {
        this(inUsername, inPassword, inURL, inHostname, inPort, inIDPrefix,
             DEFAULT_HEARTBEAT_INTERVAL);
    }

    /**
     * Creates an instance.
     *
     * @param inUsername the user name.
     * @param inPassword the password.
     * @param inURL the URL.
     * @param inHostname the host name
     * @param inPort the port number
     */
    public ClientParameters(String inUsername, char[] inPassword, String inURL,
                            String inHostname, int inPort ) {
        this(inUsername, inPassword, inURL, inHostname, inPort,null);
    }

    @Override
    public String toString() {
        return "ClientParameters{" +  //$NON-NLS-1$
                "Username='" + mUsername + '\'' +  //$NON-NLS-1$ $NON-NLS-2$
                ", Password='*****'" +  //$NON-NLS-1$
                ", URL='" + mURL + '\'' +  //$NON-NLS-1$  $NON-NLS-2$
                ", Hostname='" + mHostname + '\'' +  //$NON-NLS-1$ $NON-NLS-2$
                ", Port='" + mPort + '\'' +  //$NON-NLS-1$ $NON-NLS-2$
                ", IDPrefix='" + mIDPrefix + '\'' +  //$NON-NLS-1$ $NON-NLS-2$
                ", HeartbeatInterval='" + mHeartbeatInterval + '\'' +  //$NON-NLS-1$ $NON-NLS-2$
                '}';  //$NON-NLS-1$
    }

    private String mUsername;
    private char[] mPassword;
    private String mHostname;
    private int mPort;
    private String mURL;
    private String mIDPrefix;
    private int mHeartbeatInterval;

    public static final int DEFAULT_HEARTBEAT_INTERVAL = 5000;
}
