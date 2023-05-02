package com.springbootinflearn.hello.studyServlet.container;

import jakarta.servlet.ServletContext;

public interface AppInit {

    void onStartUp(ServletContext servletContext);
}
