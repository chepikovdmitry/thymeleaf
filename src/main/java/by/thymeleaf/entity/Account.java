package by.thymeleaf.entity;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private  int number;
    private boolean active;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<AccountType> getTypes() {
        return types;
    }

    public void setTypes(List<AccountType> types) {
        this.types = types;
    }

    private List<AccountType> types = new ArrayList<AccountType>();

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", active=" + active +
                ", types=" + types +
                '}';
    }
}
