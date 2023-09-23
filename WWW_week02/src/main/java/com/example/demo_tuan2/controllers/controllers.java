package com.example.demo_tuan2.controllers;





import com.example.demo_tuan2.enums.EmloyeeEnum;
import com.example.demo_tuan2.models.Customer;
import com.example.demo_tuan2.models.Emloyee;
import com.example.demo_tuan2.models.Order;
import com.example.demo_tuan2.servers.CustomerServe;
import com.example.demo_tuan2.servers.EmloyeeSever;
import com.example.demo_tuan2.servers.OrderSever;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

    @WebServlet(urlPatterns = {"/ControlServlet"})
    public class controllers  extends HttpServlet {

        private EmloyeeSever service;

        private CustomerServe customerService;

        private OrderSever orderService;


        public boolean createOrder() {
            EmloyeeSever eService = new EmloyeeSever();
            OrderSever oService = new OrderSever();
            CustomerServe cService = new CustomerServe();
            Emloyee e = new Emloyee("emp1", "khai baby", LocalDate.of(2002, 5, 29), "khai@mail", "032423", "tan binh", EmloyeeEnum.ACTIVE);
            eService.create(e);
            Customer c = new Customer("cust1", "khai not baby", "khai@mail", "0234143", "tan binh");
            cService.create(c);
            Order o = new Order("order1", LocalDateTime.now(), e, c);
            oService.create(o);
            return true;

        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            createOrder();
            RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        }


    }


