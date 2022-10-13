package id.co.bankmandiri.customerapp.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
    private int customerId;
    private String fistName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Customer(String fistname, String lastname, LocalDate dateofbirth) {
        this.fistName = fistname;
        this.lastName = lastname;
        this.dateOfBirth = dateofbirth;
    }

    public Customer(int customerId, String fistName, String lastName, LocalDate dateOfBirth) {
        this(fistName, lastName, dateOfBirth);
        this.customerId = customerId;

    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setFirstName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer=" + customerId +
                ", fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer1 = (Customer) o;
        return customerId == customer1.customerId &&
                Objects.equals(fistName, customer1.fistName) &&
                Objects.equals(lastName, customer1.lastName) &&
                Objects.equals(dateOfBirth, customer1.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, fistName, lastName, dateOfBirth);
    }
}
