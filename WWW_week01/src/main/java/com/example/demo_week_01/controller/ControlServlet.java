package com.example.demo_week_01.controller;


import com.example.demo_week_01.enums.AccountStatus;
import com.example.demo_week_01.enums.GrantStatus;
import com.example.demo_week_01.enums.RoleStatus;
import com.example.demo_week_01.models.*;
import com.example.demo_week_01.service.AccountService;
import com.example.demo_week_01.service.GrantAccessService;
import com.example.demo_week_01.service.LogService;
import com.example.demo_week_01.service.RoleService;

import jakarta.inject.Inject;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Logger;

@WebServlet(urlPatterns = {"/ControlServlet"})
public class ControlServlet extends HttpServlet {

    @Inject
    private AccountService accountService;
    @Inject
    private RoleService roleService;
    @Inject
    private GrantAccessService gService;
    @Inject
    private LogService logService;


    private Logger logger;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("create.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String u="";
        if ("addAccount".equals(action)) {
            String newUsername = req.getParameter("newUsername");
            String newPassword = req.getParameter("newPassword");
            String email = req.getParameter("email");
            String phone = req.getParameter("phone");
            String fullName = req.getParameter("fullName");
            Account a = new Account(newUsername, fullName, newPassword, email, phone, AccountStatus.ACTIVE);
            accountService.create(a);
            logger.info("sign success");
            resp.sendRedirect("login.jsp");

        } else if ("updateAccount".equals(action)) {
            String updateUsername = req.getParameter("updateUsername");
            String newPassword = req.getParameter("newPassword");
            String Password = req.getParameter("Password");
            Account a = accountService.findById(updateUsername);
            boolean b = a.getPassword().equalsIgnoreCase(Password);
            if (a == null && b) {
                resp.sendRedirect("error.jsp");
            }
            a.setAccount_id(updateUsername);
            a.setPassword(newPassword);
            accountService.update(a);
        } else if ("deleteAccount".equals(action)) {
            String updateUsername = req.getParameter("deleteUsername");
            Account a = accountService.findById(updateUsername);
            if (a == null) {
                resp.sendRedirect("error.jsp");
            }
            accountService.delete(updateUsername);
        } else if ("login".equals(action)) {
             u = req.getParameter("username");
            String p = req.getParameter("password");
            Account a = accountService.findById(u);
            if (a == null|| a.getPassword().equalsIgnoreCase(p)) {
                resp.sendRedirect("error.jsp");
            }
            Log l= new Log(a, LocalDateTime.now(),null,"login");
            logService.createLog(l);
            req.setAttribute("username", u);
            req.setAttribute("password", p);
            RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
            dispatcher.forward(req, resp);
        } else if ("displayAccountInfo".equals(action)) {
            u = req.getParameter("username");
            Account a = accountService.findById(u);
            if (a == null) {
                resp.sendRedirect("error.jsp");
            }
            req.setAttribute("username", u);
            RequestDispatcher dispatcher = req.getRequestDispatcher("displayRole.jsp");
            dispatcher.forward(req, resp);
        } else if ("displayAccountRoles".equals(action)) {
            u = req.getParameter("username");
            Account a = accountService.findById(u);
            Account r = accountService.findRole(u);
            if (a == null||r==null) {
                resp.sendRedirect("error.jsp");
            }

            req.setAttribute("Role", r);
            RequestDispatcher dispatcher = req.getRequestDispatcher("displayRole.jsp");
            dispatcher.forward(req, resp);
        } else if ("displayAccountsByRole".equals(action)) {
            List<Account> l = accountService.dAccByRole();
            req.setAttribute("username", u);
            RequestDispatcher dispatcher = req.getRequestDispatcher("displayRole.jsp");
            dispatcher.forward(req, resp);
        } else if ("grantPermission".equals(action)) {
            u = req.getParameter("grantUsername");
            Account a = accountService.findById(u);
            if (a == null) {
                resp.sendRedirect("error.jsp");
            }
            Role r=new Role("role1","User","normal user", RoleStatus.ACTIVE);
            roleService.create(r);
            GrantAccess g= new GrantAccess(a,r,"grant normal", GrantStatus.DELETE);
            gService.grantAccess(g);

        } else if ("logLoginLogout".equals(action)) {
            u = req.getParameter("username");
            Account a = accountService.findById(u);
            if (a == null) {
                resp.sendRedirect("error.jsp");
            }
            List<Log> l = logService.find(u);
            req.setAttribute("Log", l);
            RequestDispatcher dispatcher = req.getRequestDispatcher("writeLog.jsp");
            dispatcher.forward(req, resp);
        } else {
            resp.sendRedirect("error.jsp");
        }

    }
}
