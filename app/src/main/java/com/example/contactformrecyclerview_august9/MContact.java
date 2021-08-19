package com.example.contactformrecyclerview_august9;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Objects;

public class MContact {

    @Nullable
    private String name;
    @NonNull
    private String number;
    @Nullable
    private String company;

    public MContact(@NonNull String name, @Nullable String number, String company) {
        this.name = name;
        this.number = number;
        this.company = company;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MContact mContact = (MContact) o;
        return name.equals(mContact.name) &&
                number.equals(mContact.number) &&
                company.equals(mContact.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, company);
    }

    @Override
    public String toString() {
        return "MContact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
