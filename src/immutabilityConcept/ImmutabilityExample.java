package javatrainning.immutabilityConcept;

public final class ImmutabilityExample {
    private final String name;
    private final Integer phoneNumber;
    private final Integer salary;
    private final String address;


    public ImmutabilityExample(String name, Integer phoneNumber, Integer salary, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
}

