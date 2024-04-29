package com.mindhub.homebanking.models;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private TransactionType type;

    private double amount;
    private String description;
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")

    private Account account;

    /*
     * Obtiene el campo id.
     *
     * @return
     *
     */
    public long getId() {
        return id;
    }

    /*
     * Modificada el campo id
     *
     * @param $paraName $file.name a Modificar
     *

     */
    public void setId(long id) {
        this.id = id;
    }

    /*
     * Obtiene el campo type.
     *
     * @return
     *
     */
    public TransactionType getType() {
        return type;
    }

    /*
     * Modificada el campo type
     *
     * @param $paraName $file.name a Modificar
     *

     */
    public void setType(TransactionType type) {
        this.type = type;
    }

    /*
     * Obtiene el campo amount.
     *
     * @return
     *
     */
    public double getAmount() {
        return amount;
    }

    /*
     * Modificada el campo amount
     *
     * @param $paraName $file.name a Modificar
     *

     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /*
     * Obtiene el campo description.
     *
     * @return
     *
     */
    public String getDescription() {
        return description;
    }

    /*
     * Modificada el campo description
     *
     * @param $paraName $file.name a Modificar
     *

     */
    public void setDescription(String description) {
        this.description = description;
    }

    /*
     * Obtiene el campo date.
     *
     * @return
     *
     */
    public LocalDate getDate() {
        return date;
    }

    /*
     * Modificada el campo date
     *
     * @param $paraName $file.name a Modificar
     *

     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /*
     * Obtiene el campo account.
     *
     * @return
     *
     */
    public Account getAccount() {
        return account;
    }

    /*
     * Modificada el campo account
     *
     * @param $paraName $file.name a Modificar
     *

     */
    public void setAccount(Account account) {
        this.account = account;
    }
}
