package com.example.www_week5;

import com.example.www_week5.services.AddressService;
import com.example.www_week5.services.CandidateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WwwWeek5Application {
    @Qualifier("addressImple")
    @Autowired
    private AddressService service;
    @Autowired
    private CandidateService candidateService;

    public static void main(String[] args) {
        SpringApplication.run(WwwWeek5Application.class, args);
    }

//    @Bean
//    CommandLineRunner initData() {
//
//        return args -> {
//            Random rd = new Random();
//            for (int i = 1; i < 1000; i++) {
//                Address a = new Address("HCM", CountryCode.VN, rd.nextInt(70000, 80000) + "", "Truong Chinh", rd.nextInt(1, 1000) + "");
//                service.save(a);
//                Candidate c = new Candidate(rd.nextLong(1111111111L, 9999999999L) + "", LocalDate.of(rd.nextInt(1980, 2004), rd.nextInt(1, 13), rd.nextInt(1, 29)), "email_" + i + "@gmail.com", "Name #" + i,a, CandidateStatus.ACTIVE);
//                candidateService.save(c);
//            }
//        };
//    }
}
