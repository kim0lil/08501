package dummy;

import java.util.Properties;

public class HelloMaven {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();

        props.load(ClassLoader.getSystemClassLoader().getResourceAsStream("configuration.properties"));

        String sName    = (String)props.get("name");
        String sVersion = (String)props.get("version");
        String sSkillLv = (String)props.get("skill-lv");

        System.out.print("name : "       + sName
                        +", version : "  + sVersion
                        +", skill-lv : " + sSkillLv);
    }
}