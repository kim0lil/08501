package service;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloMavenServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Properties props = new Properties();
        
        String sFileName = "configuration.properties";
        
        // 웹 서비스의 기준 경로를 지정 하기 위해서는 여러 컨텍스트들이 있기 때문에
        // 해당 컨텍스트의 기준 경로로 부터 찾아 들어 가야 합니다.
        props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(sFileName));

        String sName    = (String)props.get("name");
        String sVersion = (String)props.get("version");
        String sSkillLv = (String)props.get("skill-lv");

	response.getWriter()
		.append( "name : "       + sName
                       + ", version : "  + sVersion
                       + ", skill-lv : " + sSkillLv );
	}
}