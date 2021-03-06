package org.marketcetera.client.users;

import java.io.Serializable;
import java.util.Properties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.marketcetera.trade.UserID;
import org.marketcetera.util.misc.ClassVersion;

/**
 * The web service representation of a user's information.
 *
 * @author tlerios@marketcetera.com
 * @since 1.5.0
 * @version $Id: UserInfo.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@ClassVersion("$Id: UserInfo.java 16154 2012-07-14 16:34:05Z colin $")
public class UserInfo
    implements Serializable
{

    // CLASS DATA.

    private static final long serialVersionUID=1L;


    // INSTANCE DATA.

    private final String mName;
    private final UserID mId;
    private final boolean mActive;
    private final boolean mSuperuser;
    private final Properties mUserData;
    private final Properties mSystemData;


    // CONSTRUCTORS.

    /**
     * Creates a new user info representation, given the user
     * information.
     *
     * @param name The user name.
     * @param id The user ID.
     * @param active The active flag.
     * @param superuser The superuser flag.
     * @param userdata The user data
     * @param systemdata The system data
     */

    public UserInfo
        (String name,
         UserID id,
         boolean active,
         boolean superuser,
         Properties userdata,
         Properties systemdata)
    {
        mName=name;
        mId=id;
        mActive=active;
        mSuperuser=superuser;
        mUserData=userdata;
        mSystemData=systemdata;
    }

    /**
     * Creates a new status representation. This empty constructor is
     * intended for use by JAXB.
     */

    protected UserInfo()
    {
        mName=null;
        mId=null;
        mActive=false;
        mSuperuser=false;
        mUserData=null;
        mSystemData=null;
    }


    // INSTANCE METHODS.

    /**
     * Returns the receiver's name.
     *
     * @return The name.
     */

    public String getName()
    {
        return mName;
    }

    /**
     * Returns the receiver's user ID.
     *
     * @return The ID.
     */

    public UserID getId()
    {
        return mId;
    }

    /**
     * Returns the receiver's active flag.
     *
     * @return The flag.
     */

    public boolean getActive()
    {
        return mActive;
    }

    /**
     * Returns the receiver's superuser flag.
     *
     * @return The flag.
     */

    public boolean getSuperuser()
    {
        return mSuperuser;
    }

    /**
     * Returns the receiver's user data.
     *
     * @return The Properties.
     */
    public Properties getUserData()
    {
        return mUserData;
    }

    /**
     * Returns the receiver's system data.
     *
     * @return The Properties.
     */
    public Properties getSystemData()
    {
        return mSystemData;
    }

    // Object.

    @Override
    public String toString()
    {
        return String.format
            ("User: %s(%s,%s,%s,%s)", //$NON-NLS-1$
             String.valueOf(getName()),String.valueOf(getId()),
             getActive(),getSuperuser(),getUserData());
    }
}
