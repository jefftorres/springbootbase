package com.chef.demo.payroll;

public enum Status {
    /*
    Orders must go through a certain series of state transitions
    from the time a customer submits an order
    and it is either fulfilled or cancelled.
    This can be captured as a Java enum.
    This enum captures the various states an Order can occupy.
    */
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}
