package com.ognice.cas.conf;

import org.jasig.cas.client.authentication.AuthenticationRedirectStrategy;
import org.jasig.cas.client.util.CommonUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public final class MyStretegy implements AuthenticationRedirectStrategy {
    public MyStretegy() {
    }

    @Override
    public void redirect(HttpServletRequest request, HttpServletResponse response, String potentialRedirectUrl) throws IOException {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String head = headerNames.nextElement();
            System.out.println(head + ":" +
                    request.getHeader(head));
        }

       // if (CommonUtils.isNotBlank(request.getHeader("referer"))

            //  &&request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")
     //   ) {
            response.setContentType("application/json");
            response.setStatus(401);
            PrintWriter writer = response.getWriter();
            writer.write("{\"data\":{\"redirect\":\""+"http://login.batmobi.cn/login?service=http://localhost/index"+"\"},\"msg\":1,\"code\":10401}");
     //   } else {
      //      System.out.println("1");
        //    response.sendRedirect(potentialRedirectUrl);
        //}

    }
}
