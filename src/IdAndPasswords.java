import java.util.HashMap;

public class IdAndPasswords {

    HashMap<String, String> loginInfo = new HashMap<>();
    IdAndPasswords(){
        loginInfo.put("Peter", "peter");
        loginInfo.put("John", "john");
        loginInfo.put("Maria", "maria");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
