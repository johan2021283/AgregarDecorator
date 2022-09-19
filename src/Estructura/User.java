package Estructura;

import javax.xml.crypto.Data;

public abstract class User {
    private String Userid;
    private String password;
    private String loginstatus;
    private Data registerdate;

    public boolean verifyLogin(){

        return false;
    }
}
