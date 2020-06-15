package ru.job4j.persistence;

import java.util.Objects;

public class Place {
    private int row;
    private int column;
    private boolean isActive;
    private int idAccount;

    public Place(int row, int column, boolean isActive) {
        this.row = row;
        this.column = column;
        this.isActive = isActive;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Place place = (Place) o;
        return row == place.row && +
                column == place.column && isActive == place.isActive && +
                idAccount == place.idAccount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column, isActive, idAccount);
    }
}
