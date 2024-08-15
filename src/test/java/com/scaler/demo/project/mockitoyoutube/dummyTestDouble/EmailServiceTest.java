package com.scaler.demo.project.mockitoyoutube.dummyTestDouble;

public class EmailServiceTest implements EmailService {
    @Override
    public void sendEmail() {
        throw new AssertionError("email service test");
    }
}
